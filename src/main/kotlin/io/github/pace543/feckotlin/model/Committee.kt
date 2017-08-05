package io.github.pace543.feckotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Committee(
        @SerializedName("candidate_ids")
        @Expose
        val candidateIds: List<String>?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_type")
        @Expose
        val committeeType: String?,

        @SerializedName("committee_type_full")
        @Expose
        val committeeTypeFull: String?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("designation")
        @Expose
        val designation: String?,

        @SerializedName("designation_full")
        @Expose
        val designationFull: String?,

        @SerializedName("first_file_date")
        @Expose
        val firstFileDate: String?,

        @SerializedName("last_f1_date")
        @Expose
        val lastF1Date: String?,

        @SerializedName("last_file_date")
        @Expose
        val lastFileDate: String?,

        @SerializedName("name")
        @Expose
        val name: String?,

        @SerializedName("organization_type")
        @Expose
        val organizationType: String?,

        @SerializedName("organization_type_full")
        @Expose
        val organizationTypeFull: String?,

        @SerializedName("party")
        @Expose
        val party: String?,

        @SerializedName("party_full")
        @Expose
        val partyFull: String?,

        @SerializedName("state")
        @Expose
        val state: String?,

        @SerializedName("treasurer_name")
        @Expose
        val treasurerName: String?
)