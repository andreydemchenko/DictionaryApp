package ru.turbopro.dictionary.feature_dictionary.domain.use_case

import ru.turbopro.dictionary.feature_dictionary.domain.model.WordInfo
import ru.turbopro.dictionary.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.turbopro.dictionary.core.util.Resource

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}