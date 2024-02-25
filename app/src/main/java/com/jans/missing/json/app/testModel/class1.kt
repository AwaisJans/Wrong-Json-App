package com.jans.missing.json.app.testModel


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class class1(
    @SerializedName("items")
    @Expose
    var items: List<Item> = listOf(),
    @SerializedName("status")
    @Expose
    var status: String = ""
)


data class Item(
    @SerializedName("beschreibung")
    @Expose
    var beschreibung: String = "",
    @SerializedName("bezeichnung")
    @Expose
    var bezeichnung: String = "",
    @SerializedName("bild")
    @Expose
    var bild: Bild? = null,
    @SerializedName("bilder")
    @Expose
    var bilder: List<Bilder> = listOf(),
    @SerializedName("data")
    @Expose
    var `data`: Data = Data(),
    @SerializedName("dateien")
    @Expose
    var dateien: List<Any> = listOf(),
    @SerializedName("icon")
    @Expose
    var icon: Icon = Icon(),
    @SerializedName("id")
    @Expose
    var id: Int = 0,
    @SerializedName("isDetailsWebsite")
    @Expose
    var isDetailsWebsite: Boolean = false,
    @SerializedName("kategorien")
    @Expose
    var kategorien: List<Kategorien> = listOf(),
    @SerializedName("urlDetails")
    @Expose
    var urlDetails: String = "",
    @SerializedName("urlPopUp")
    @Expose
    var urlPopUp: String = ""
) : Serializable


data class Bild(
    @SerializedName("bezeichnung")
    @Expose
    var bezeichnung: String = "",
    @SerializedName("id")
    @Expose
    var id: Int = 0,
    @SerializedName("url")
    @Expose
    var url: String = ""
): Serializable

data class Bilder(
    @SerializedName("bezeichnung")
    @Expose
    var bezeichnung: String = "",
    @SerializedName("id")
    @Expose
    var id: Int = 0,
    @SerializedName("url")
    @Expose
    var url: String = ""
): Serializable

data class Data(
    @SerializedName("type")
    @Expose
    var type: String = "",
    @SerializedName("coords")
    @Expose
    var coords: List<Coord> = listOf(),
    @SerializedName("options")
    @Expose
    var options: Options = Options()
): Serializable

data class Coord(
    @SerializedName("lat")
    @Expose
    var lat: Double = 0.0,
    @SerializedName("lng")
    @Expose
    var lng: Double = 0.0
): Serializable

data class Options(
    @SerializedName("color")
    @Expose
    var color: String = "",
    @SerializedName("weight")
    @Expose
    var weight: Int = 0,
    @SerializedName("radius")
    @Expose
    var radius: Int = 0,
    @SerializedName("fillOpacity")
    @Expose
    var fillOpacity: Double = 0.0,
    @SerializedName("opacity")
    @Expose
    var opacity: Int = 0,
    @SerializedName("fill")
    @Expose
    var fill: Boolean = false,
    @SerializedName("stroke")
    @Expose
    var stroke: Boolean = false
): Serializable
data class Icon(
    @SerializedName("bezeichnung")
    @Expose
    var bezeichnung: String = "",
    @SerializedName("icon")
    @Expose
    var icon: String = "",
    @SerializedName("icon_style")
    @Expose
    var iconStyle: String = "",
    @SerializedName("id")
    @Expose
    var id: Int = 0,
    @SerializedName("farbe")
    @Expose
    var farbe: String = "",
    @SerializedName("form")
    @Expose
    var form: String = ""
): Serializable

data class Kategorien(
    @SerializedName("bezeichnung")
    @Expose
    var bezeichnung: String = "",
    @SerializedName("icon")
    @Expose
    var icon: String = "",
    @SerializedName("icon_style")
    @Expose
    var iconStyle: String = "",
    @SerializedName("id")
    @Expose
    var id: Int = 0,
    @SerializedName("farbe")
    @Expose
    var farbe: String = "",
    @SerializedName("form")
    @Expose
    var form: String = ""
): Serializable