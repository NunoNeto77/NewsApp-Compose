package com.example.newsapp.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.newsapp.domain.model.Source

@ProvidedTypeConverter
class NewsTypeConverter {

    @TypeConverter
    fun fromSourceToString(source: Source): String {
        return "${source.id},${source.name}"
    }

    @TypeConverter
    fun fromStringToSource(sourceString: String): Source {
        return sourceString.split(",").let { sourceArray ->
            Source(id = sourceArray[0], name = sourceArray[1])
        }
    }
}