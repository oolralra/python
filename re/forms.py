from django import forms
from .models import Review

class ReviewForm(forms.ModelForm):
    class Meta:
        model = Review
        fields = ['title', 'author','content']

"""
from django import forms : django가 기본적으로 제공하는 forms 모델을 import
from .models import Review : Review 모델을 import
forms.ModelForm : 모델과 필드를 지정하면 모델폼이 자동으로 폼 필드를 생성
"""
