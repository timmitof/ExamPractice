package com.timmitof.exampractice

import com.timmitof.exampractice.models.Category
import com.timmitof.exampractice.models.NewsList

class Constants {
    companion object{
        val categories = arrayListOf(
            Category(Categories.Criminal.ordinal, R.string.criminal),
            Category(Categories.Natural.ordinal, R.string.natural),
            Category(Categories.Political.ordinal, R.string.political),
            Category(Categories.Sport.ordinal, R.string.sport)
        )

        val picture = arrayListOf(
            NewsList(Categories.Criminal.ordinal, "https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg", "Criminal"),
            NewsList(Categories.Natural.ordinal, "https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg","Natural"),
            NewsList(Categories.Political.ordinal, "https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg","Political"),
            NewsList(Categories.Sport.ordinal, "https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg","Sport")

        )
    }
}

enum class Categories(value: Int) {
    Criminal(1),
    Natural(2),
    Political(3),
    Sport(4)
}