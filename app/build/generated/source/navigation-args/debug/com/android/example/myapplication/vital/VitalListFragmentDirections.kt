package com.android.example.myapplication.vital

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.android.example.myapplication.R
import com.android.example.myapplication.data.Vital
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

class VitalListFragmentDirections private constructor() {
    private data class ActionVitalListFragmentDestToVitalDetailsFragment(val vital: Vital? = null,
            val title: String = "\"\"") : NavDirections {
        override fun getActionId(): Int =
                R.id.action_vital_list_fragment_dest_to_vitalDetailsFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(Vital::class.java)) {
                result.putParcelable("vital", this.vital as Parcelable?)
            } else if (Serializable::class.java.isAssignableFrom(Vital::class.java)) {
                result.putSerializable("vital", this.vital as Serializable?)
            }
            result.putString("title", this.title)
            return result
        }
    }

    companion object {
        fun actionVitalListFragmentDestToVitalDetailsFragment(vital: Vital? = null, title: String =
                "\"\""): NavDirections = ActionVitalListFragmentDestToVitalDetailsFragment(vital,
                title)
    }
}
