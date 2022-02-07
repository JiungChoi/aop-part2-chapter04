package jiung.fastcampus.aop.part2.chapter04

import androidx.room.Database
import androidx.room.RoomDatabase
import jiung.fastcampus.aop.part2.chapter04.dao.HistoryDao
import jiung.fastcampus.aop.part2.chapter04.model.History

@Database(entities = [History::class], version=1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun historyDao():HistoryDao
}