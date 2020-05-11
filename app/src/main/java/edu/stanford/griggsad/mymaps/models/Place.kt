package edu.stanford.griggsad.mymaps.models

import java.io.Serializable

data class Place(val title: String, val description: String, val latitude: Double, val longitude: Double): Serializable