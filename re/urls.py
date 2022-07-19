from django.contrib import admin
from django.urls import path
import review.views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('/',review.views.main,name="main"),
    path('create/',review.views.create,name='create'),
    path('detail/<int:pk>/',review.views.detail,name='detail'),
    path('update/<int:pk>/',review.views.update,name='update'),
    path('delete/<int:pk>/',review.views.delete,name='delete')
]