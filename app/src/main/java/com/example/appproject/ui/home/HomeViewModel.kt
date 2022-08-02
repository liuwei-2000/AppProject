package com.example.appproject.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class ViewModel: ViewModel() {
    var news = MutableLiveData<ArticleItem>()
    fun getDatas():List<ArticleItem> {
        var articleList:MutableList<ArticleItem> = Test.articleList.data.datas
        return articleList
    }
}
