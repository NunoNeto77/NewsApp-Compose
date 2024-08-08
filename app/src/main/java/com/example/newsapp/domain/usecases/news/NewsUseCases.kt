package com.example.newsapp.domain.usecases.news

data class NewsUseCases(
    val getNewsUseCase: GetNewsUseCase,
    val searchNewsUseCase: SearchNewsUseCase,
    val upsertArticleUseCase: UpsertArticleUseCase,
    val deleteArticleUseCase: DeleteArticleUseCase,
    val selectArticlesUseCase: SelectArticlesUseCase,
    val selectArticleUseCase: SelectArticleUseCase,
)
