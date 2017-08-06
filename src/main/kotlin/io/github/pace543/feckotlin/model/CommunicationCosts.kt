package io.github.pace543.feckotlin.model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CommunicationCostByCandidatePage(val pagination: OffsetInfo?, val results: List<CommunicationCostByCandidate>?) {
    class Deserializer : ResponseDeserializable<CommunicationCostByCandidatePage> {
        override fun deserialize(content: String): CommunicationCostByCandidatePage? =
                Gson().fromJson(content, CommunicationCostByCandidatePage::class.java)
    }
}

data class CommunicationCostPage(val pagination: SeekInfo?, val results: List<CommunicationCost>?) {
    class Deserializer : ResponseDeserializable<CommunicationCostPage> {
        override fun deserialize(content: String): CommunicationCostPage? =
                Gson().fromJson(content, CommunicationCostPage::class.java)
    }
}

data class SeekInfo(
        @SerializedName("count")
        @Expose
        val count: Int?,

        @SerializedName("last_indexes")
        @Expose
        val lastIndexes: String?,

        @SerializedName("pages")
        @Expose
        val pages: Int?,

        @SerializedName("per_page")
        @Expose
        val perPage: Int?
)

data class CommunicationCostByCandidate(
        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_name")
        @Expose
        val candidateName: String?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_name")
        @Expose
        val committeeName: String?,

        @SerializedName("count")
        @Expose
        val count: Int?,

        @SerializedName("cycle")
        @Expose
        val cycle: Int?,

        @SerializedName("support_oppose_indicator")
        @Expose
        val supportOpposeIndicator: String?,

        @SerializedName("total")
        @Expose
        val total: Double?
)

data class CommunicationCost(
        @SerializedName("action_code")
        @Expose
        val actionCode: String?,

        @SerializedName("action_code_full")
        @Expose
        val actionCodeFull: String?,

        @SerializedName("candidate_first_name")
        @Expose
        val candidateFirstName: String?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_last_name")
        @Expose
        val candidateLastName: String?,

        @SerializedName("candidate_middle_name")
        @Expose
        val candidateMiddleName: String?,

        @SerializedName("candidate_name")
        @Expose
        val candidateName: String?,

        @SerializedName("candidate_office")
        @Expose
        val candidateOffice: String?,

        @SerializedName("candidate_office_district")
        @Expose
        val candidateOfficeDistrict: String?,

        @SerializedName("candidate_office_full")
        @Expose
        val candidateOfficeFull: String?,

        @SerializedName("candidate_office_state")
        @Expose
        val candidateOfficeState: String?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_name")
        @Expose
        val committeeName: String?,

        @SerializedName("communication_class")
        @Expose
        val communicationClass: String?,

        @SerializedName("communication_type")
        @Expose
        val communicationType: String?,

        @SerializedName("communication_type_full")
        @Expose
        val communicationTypeFull: String?,

        @SerializedName("cycle")
        @Expose
        val cycle: Int?,

        @SerializedName("file_number")
        @Expose
        val fileNumber: Int?,

        @SerializedName("form_type_code")
        @Expose
        val formTypeCode: String?,

        @SerializedName("image_number")
        @Expose
        val imageNumber: String?,

        @SerializedName("original_sub_id")
        @Expose
        val originalSubId: Int?,

        @SerializedName("pdf_url")
        @Expose
        val pdfUrl: String?,

        @SerializedName("primary_general_indicator")
        @Expose
        val primaryGeneralIndicator: String?,

        @SerializedName("primary_general_indicator_description")
        @Expose
        val primaryGeneralIndicatorDescription: String?,

        @SerializedName("purpose")
        @Expose
        val purpose: String?,

        @SerializedName("report_type")
        @Expose
        val reportType: String?,

        @SerializedName("report_year")
        @Expose
        val reportYear: Int?,

        @SerializedName("schedule_type")
        @Expose
        val scheduleType: String?,

        @SerializedName("schedule_type_full")
        @Expose
        val scheduleTypeFull: String?,

        @SerializedName("state_full")
        @Expose
        val stateFull: String?,

        @SerializedName("sub_id")
        @Expose
        val subId: Long?,

        @SerializedName("support_oppose_indicator")
        @Expose
        val supportOpposeIndicator: String?,

        @SerializedName("tran_id")
        @Expose
        val tranId: String?,

        @SerializedName("transaction_amount")
        @Expose
        val transactionAmount: Double?,

        @SerializedName("transaction_date")
        @Expose
        val transactionDate: String?,

        @SerializedName("transaction_type")
        @Expose
        val transactionType: String?
)