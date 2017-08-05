package io.github.pace543.feckotlin.model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CommitteeDetailPage(val pagination: OffsetInfo?, val results: List<CommitteeDetail>?) {
    class Deserializer : ResponseDeserializable<CommitteeDetailPage> {
        override fun deserialize(content: String): CommitteeDetailPage? =
                Gson().fromJson(content, CommitteeDetailPage::class.java)
    }
}

data class CommitteeHistoryPage(val pagination: OffsetInfo?, val results: List<CommitteeHistory>?) {
    class Deserializer : ResponseDeserializable<CommitteeHistoryPage> {
        override fun deserialize(content: String): CommitteeHistoryPage? =
                Gson().fromJson(content, CommitteeHistoryPage::class.java)
    }
}

data class CommitteePage(val pagination: OffsetInfo?, val results: List<Committee>?) {
    class Deserializer : ResponseDeserializable<CommitteePage> {
        override fun deserialize(content: String): CommitteePage? =
                Gson().fromJson(content, CommitteePage::class.java)
    }
}

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

data class CommitteeDetail(
        @SerializedName("candidate_ids")
        @Expose
        val candidateIds: List<String>?,

        @SerializedName("city")
        @Expose
        val city: String?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_type")
        @Expose
        val committeeType: String?,

        @SerializedName("committee_type_full")
        @Expose
        val committeeTypeFull: String?,

        @SerializedName("custodian_city")
        @Expose
        val custodianCity: String?,

        @SerializedName("custodian_name_1")
        @Expose
        val custodianName1: String?,

        @SerializedName("custodian_name_2")
        @Expose
        val custodianName2: String?,

        @SerializedName("custodian_name_full")
        @Expose
        val custodianNameFull: String?,

        @SerializedName("custodian_name_middle")
        @Expose
        val custodianNameMiddle: String?,

        @SerializedName("custodian_name_prefix")
        @Expose
        val custodianNamePrefix: String?,

        @SerializedName("custodian_name_suffix")
        @Expose
        val custodianNameSuffix: String?,

        @SerializedName("custodian_name_title")
        @Expose
        val custodianNameTitle: String?,

        @SerializedName("custodian_phone")
        @Expose
        val custodianPhone: String?,

        @SerializedName("custodian_state")
        @Expose
        val custodianState: String?,

        @SerializedName("custodian_street_1")
        @Expose
        val custodianStreet1: String?,

        @SerializedName("custodian_street_2")
        @Expose
        val custodianStreet2: String?,

        @SerializedName("custodian_zip")
        @Expose
        val custodianZip: String?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("designation")
        @Expose
        val designation: String?,

        @SerializedName("designation_full")
        @Expose
        val designationFull: String?,

        @SerializedName("email")
        @Expose
        val email: String?,

        @SerializedName("fax")
        @Expose
        val fax: String?,

        @SerializedName("filing_frequency")
        @Expose
        val filingFrequency: String?,

        @SerializedName("first_file_date")
        @Expose
        val firstFileDate: String?,

        @SerializedName("form_type")
        @Expose
        val formType: String?,

        @SerializedName("last_file_date")
        @Expose
        val lastFileDate: String?,

        @SerializedName("leadership_pac")
        @Expose
        val leadershipPac: String?,

        @SerializedName("lobbyist_registrant_pac")
        @Expose
        val lobbyistRegistrantPac: String?,

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

        @SerializedName("party_type")
        @Expose
        val partyType: String?,

        @SerializedName("party_type_full")
        @Expose
        val partyTypeFull: String?,

        @SerializedName("qualifying_date")
        @Expose
        val qualifyingDate: String?,

        @SerializedName("state")
        @Expose
        val state: String?,

        @SerializedName("state_full")
        @Expose
        val stateFull: String?,

        @SerializedName("street_1")
        @Expose
        val street1: String?,

        @SerializedName("street_2")
        @Expose
        val street2: String?,

        @SerializedName("treasurer_city")
        @Expose
        val treasurerCity: String?,

        @SerializedName("treasurer_name")
        @Expose
        val treasurerName: String?,

        @SerializedName("treasurer_name_1")
        @Expose
        val treasurerName1: String?,

        @SerializedName("treasurer_name_2")
        @Expose
        val treasurerName2: String?,

        @SerializedName("treasurer_name_middle")
        @Expose
        val treasurerNameMiddle: String?,

        @SerializedName("treasurer_name_prefix")
        @Expose
        val treasurerNamePrefix: String?,

        @SerializedName("treasurer_name_suffix")
        @Expose
        val treasurerNameSuffix: String?,

        @SerializedName("treasurer_name_title")
        @Expose
        val treasurerNameTitle: String?,

        @SerializedName("treasurer_phone")
        @Expose
        val treasurerPhone: String?,

        @SerializedName("treasurer_state")
        @Expose
        val treasurerState: String?,

        @SerializedName("treasurer_street_1")
        @Expose
        val treasurerStreet1: String?,

        @SerializedName("treasurer_street_2")
        @Expose
        val treasurerStreet2: String?,

        @SerializedName("treasurer_zip")
        @Expose
        val treasurerZip: String?,

        @SerializedName("website")
        @Expose
        val website: String?,

        @SerializedName("zip")
        @Expose
        val zip: String?
)

data class CommitteeHistory(
        @SerializedName("candidate_ids")
        @Expose
        val candidateIds: List<String>?,

        @SerializedName("city")
        @Expose
        val city: String?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_type")
        @Expose
        val committeeType: String?,

        @SerializedName("committee_type_full")
        @Expose
        val committeeTypeFull: String?,

        @SerializedName("cycle")
        @Expose
        val cycle: Int?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("designation")
        @Expose
        val designation: String?,

        @SerializedName("designation_full")
        @Expose
        val designationFull: String?,

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

        @SerializedName("state_full")
        @Expose
        val stateFull: String?,

        @SerializedName("street_1")
        @Expose
        val street1: String?,

        @SerializedName("street_2")
        @Expose
        val street2: String?,

        @SerializedName("treasurer_name")
        @Expose
        val treasurerName: String?,

        @SerializedName("zip")
        @Expose
        val zip: String?
)