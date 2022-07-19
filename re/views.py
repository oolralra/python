"""
Main / Create View
html을 보여주기 위해 views.py를 작성하고 URL연결을 해준다.
"""
from django.shortcuts import render, redirect # import redirect
from .models import Review
from .forms import ReviewForm # forms.py에서 ReviewForm 가져오기

# Create your views here.
def main(request):
    reviews = Review.objects
    return render(request,'reviews.html',{'reviews':reviews})

def create(request):
    if request.method == 'POST': # method가 post일때
        form = ReviewForm(request.POST) # form 에 ReviewForm 할당
        if form.is_valid(): # form 유효성 검증
            form.save() # 저장
            return redirect('main') # 다시 main으로
    else:
        form = ReviewForm() # 빈 form 열기
    return render(request, 'create.html',{'form' :form})

"""
create의 if : 사용자가 POST방식으로 request요청을 보내면 유효성 검증 뒤 내용 저장하고 main으로 돌아간다.
create의 else : post 방식이 아니면 (새 리뷰쓰기 페이지를 처음 열었으면) ReviewForm을 열어준다.
render(request, template, context) : review 모델을 불러오고 render할 때 review 객체를 생성하고 함께 보내준다.
template에서 호출할 내용들을 context 부분에 dictionary 형태로 적어준다
"""

def detail(request, pk):
    review = get_object_or_404(Review,pk=pk)
    return render(request,'detail.html',{'review':review})

"""get_object_or_404 : 해당 객체가 있으면 가져오고 없으면 404 error,
pk로 pk 사용 django에서는 model통해 DB 생성 시 PK(기본키)를
자동으로 생성해준다!
"""
def delete(request,pk):
    review = Review.objects.get(pk=pk)
    review.delete() 
    return redirect('main')