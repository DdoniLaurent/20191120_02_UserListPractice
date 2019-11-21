package com.tioeun.a20191120_02_userlistpractice.datas

import org.json.JSONObject
import java.io.Serializable

class Category : Serializable {

    var id = 0
    var title = ""
    var color = ""
    
    companion object {
        fun getCategoryFromJson(cateJson:JSONObject) : Category {
            var category = Category()
            category.id = cateJson.getInt("id")
            category.title = cateJson.getString("title")
            category.color = cateJson.getString("color")
            return category
        }
    }

    override fun equals(other: Any?): Boolean {
        var result = false

        var otherCategory = other as Category
        if(this.id == otherCategory.id) {
            result = true
        }

        return result
    }

}