package ru.turbopro.dictionary.feature_dictionary.domain.repository

import ru.turbopro.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow
import ru.turbopro.dictionary.core.util.Resource

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}