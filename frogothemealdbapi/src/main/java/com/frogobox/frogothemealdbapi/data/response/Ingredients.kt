package com.frogobox.frogothemealdbapi.data.response

import com.frogobox.frogothemealdbapi.data.model.Ingredient
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheMealsAPI
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemealdbapi.data.response
 *
 */
data class Ingredients(

    @SerializedName("meals")
    var meals: List<Ingredient>? = null

)