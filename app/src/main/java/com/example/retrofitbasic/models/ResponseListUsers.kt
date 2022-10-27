package com.example.retrofitbasic.models

import com.example.retrofitbasic.Data
import com.example.retrofitbasic.Support
import com.google.gson.annotations.SerializedName

data class ResponseListUsers(
    @SerializedName("data")
    var data: List<Data>,
    @SerializedName("page")
    var page: Int,
    @SerializedName("per_page")
    var perPage: Int,
    @SerializedName("support")
    var support: Support,
    @SerializedName("total")
    var total: Int,
    @SerializedName("total_pages")
    var totalPages: Int
)