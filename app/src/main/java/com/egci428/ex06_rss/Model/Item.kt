package com.egci428.ex06_rss.Model

data class Item(
    val title: String,
    val pubDate: String,
    val link: String,
    val guid: String,
    val author: String,
    val thumbnail: String,
    val description: String,
    val content: String,
    val enclouser: Object,
    val categories: List<String>
)