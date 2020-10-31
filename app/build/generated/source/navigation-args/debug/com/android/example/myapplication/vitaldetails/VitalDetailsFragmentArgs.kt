package com.android.example.myapplication.vitaldetails

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.android.example.myapplication.data.Vital
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class VitalDetailsFragmentArgs(val vital: Vital? = null, val title: String = "\"\"") : NavArgs
        {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Vital::class.java)) {
            result.putParcelable("vital", this.vital as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Vital::class.java)) {
            result.putSerializable("vital", this.vital as Serializable?)
        }
        result.putString("title", this.title)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): VitalDetailsFragmentArgs {
            bundle.setClassLoader(VitalDetailsFragmentArgs::class.java.classLoader)
            val __vital : Vital?
            if (bundle.containsKey("vital")) {
                if (Parcelable::class.java.isAssignableFrom(Vital::class.java) ||
                        Serializable::class.java.isAssignableFrom(Vital::class.java)) {
                    __vital = bundle.get("vital") as Vital?
                } else {
                    throw UnsupportedOperationException(Vital::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
            } else {
                __vital = null
            }
            val __title : String?
            if (bundle.containsKey("title")) {
                __title = bundle.getString("title")
                if (__title == null) {
                    throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
                }
            } else {
                __title = "\"\""
            }
            return VitalDetailsFragmentArgs(__vital, __title)
        }
    }
}
