package com.raywenderlich.shemajamebeli_6.network




import com.raywenderlich.shemajamebeli_6.data.Movie
import com.raywenderlich.shemajamebeli_6.data.Results
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieNetwork {

    @GET("{which}?api_key=f4a1da4ca928266cf21c866ca0cc7148")
    suspend fun getMovie(@Path("which")which: String): Response<Movie<List<Results>>>

}