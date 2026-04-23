package dev.toothlonely.vkeducation.data.appdetails.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDetailsDao {
    @Query("SELECT * FROM app_details WHERE id = :id")
    fun getAppDetails(id: String): Flow<AppDetailsEntity?>

    @Upsert
    fun upsertAppDetails(appDetails: AppDetailsEntity)

    @Query("UPDATE app_details SET isInWishlist = :isInWishlist WHERE id = :id")
    suspend fun updateWishlistStatus(id: String, isInWishlist: Boolean)
}
