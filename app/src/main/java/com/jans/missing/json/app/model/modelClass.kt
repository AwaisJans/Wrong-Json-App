package com.jans.missing.json.app.model


import android.content.ClipData
import android.graphics.drawable.Icon
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//data class modelClass(
//    @SerialName("items")
//    var items: List<Items?>?,
//    @SerialName("status")
//    var status: String?
//)

//data class Items(
//    @SerialName("beschreibung")
//    var beschreibung: String?,
//    @SerialName("bezeichnung")
//    var bezeichnung: String?,
//    @SerialName("bild")
//    var bild: Bild?,
//    @SerialName("bilder")
//    var bilder: List<Bilder?>?,
//    @SerialName("data")
//    var `data`: Data?,
//    @SerialName("dateien")
//    var dateien: List<Any?>?,
//    @SerialName("icon")
//    var icon: Icon?,
//    @SerialName("id")
//    var id: Int?,
//    @SerialName("isDetailsWebsite")
//    var isDetailsWebsite: Boolean?,
//    @SerialName("kategorien")
//    var kategorien: List<Kategorien?>?,
//    @SerialName("urlDetails")
//    var urlDetails: String?,
//    @SerialName("urlPopUp")
//    var urlPopUp: String?
//)
//
//data class Bild(
//    @SerialName("bezeichnung")
//    var bezeichnung: String?,
//    @SerialName("id")
//    var id: Int?,
//    @SerialName("url")
//    var url: String?
//)
//
//data class Options(
//    @SerialName("color")
//    var color: String?,
//    @SerialName("fill")
//    var fill: Boolean?,
//    @SerialName("fillOpacity")
//    var fillOpacity: Double?,
//    @SerialName("opacity")
//    var opacity: Int?,
//    @SerialName("radius")
//    var radius: Int?,
//    @SerialName("stroke")
//    var stroke: Boolean?,
//    @SerialName("weight")
//    var weight: Int?
//)
//
//data class Kategorien(
//    @SerialName("bezeichnung")
//    var bezeichnung: String?,
//    @SerialName("farbe")
//    var farbe: String?,
//    @SerialName("form")
//    var form: String?,
//    @SerialName("icon")
//    var icon: String?,
//    @SerialName("icon_style")
//    var iconStyle: String?,
//    @SerialName("id")
//    var id: Int?
//)
//
//data class Data(
//    @SerialName("coords")
//    var coords: List<Coord?>?,
//    @SerialName("options")
//    var options: Options?,
//    @SerialName("type")
//    var type: String?
//)
//
//data class Bilder(
//    @SerialName("bezeichnung")
//    var bezeichnung: String?,
//    @SerialName("id")
//    var id: Int?,
//    @SerialName("url")
//    var url: String?
//)
//
//data class Coord(
//    @SerialName("lat")
//    var lat: Double?,
//    @SerialName("lng")
//    var lng: Double?
//)
//
//data class Icon(
//    @SerialName("bezeichnung")
//    var bezeichnung: String?,
//    @SerialName("farbe")
//    var farbe: String?,
//    @SerialName("form")
//    var form: String?,
//    @SerialName("icon")
//    var icon: String?,
//    @SerialName("icon_style")
//    var iconStyle: String?,
//    @SerialName("id")
//    var id: Int?
//)
