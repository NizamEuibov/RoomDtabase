package com.example.lessons.fashion

sealed class TaskPageModel{
    class Women(val list: List<FashionDataClass>): TaskPageModel()
    class Men(val list:List<FashionDataClass>): TaskPageModel()
    class Couple(val list:List<FashionDataClass>): TaskPageModel()

}