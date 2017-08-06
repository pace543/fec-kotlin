package io.github.pace543.feckotlin.model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FilingsPage(val pagination: OffsetInfo?, val results: List<Filings>?) {
    class Deserializer : ResponseDeserializable<FilingsPage> {
        override fun deserialize(content: String): FilingsPage? =
                Gson().fromJson(content, FilingsPage::class.java)
    }
}

data class Filings(
        @SerializedName("amendment_chain")
        @Expose
        val amendmentChain: List<Double>?,

        @SerializedName("amendment_indicator")
        @Expose
        val amendmentIndicator: String?,

        @SerializedName("amendment_version")
        @Expose
        val amendmentVersion: Int?,

        @SerializedName("beginning_image_number")
        @Expose
        val beginningImageNumber: String?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_name")
        @Expose
        val candidateName: String?,

        @SerializedName("cash_on_hand_beginning_period")
        @Expose
        val cashOnHandBeginningPeriod: Double?,

        @SerializedName("cash_on_hand_end_period")
        @Expose
        val cashOnHandEndPeriod: Double?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_name")
        @Expose
        val committeeName: String?,

        @SerializedName("coverage_end_date")
        @Expose
        val coverageEndDate: String?,

        @SerializedName("coverage_start_date")
        @Expose
        val coverageStartDate: String?,

        @SerializedName("csv_url")
        @Expose
        val csvUrl: String?,

        @SerializedName("cycle")
        @Expose
        val cycle: Int?,

        @SerializedName("debts_owed_by_committee")
        @Expose
        val debtsOwedByCommittee: Double?,

        @SerializedName("debts_owed_to_committee")
        @Expose
        val debtsOwedToCommittee: Double?,

        @SerializedName("document_description")
        @Expose
        val documentDescription: String?,

        @SerializedName("document_type")
        @Expose
        val documentType: String?,

        @SerializedName("document_type_full")
        @Expose
        val documentTypeFull: String?,

        @SerializedName("election_year")
        @Expose
        val electionYear: Int?,

        @SerializedName("ending_image_number")
        @Expose
        val endingImageNumber: String?,

        @SerializedName("fec_file_id")
        @Expose
        val fecFileId: String?,

        @SerializedName("fec_url")
        @Expose
        val fecUrl: String?,

        @SerializedName("file_number")
        @Expose
        val fileNumber: Int?,

        @SerializedName("form_type")
        @Expose
        val formType: String?,

        @SerializedName("house_personal_funds")
        @Expose
        val housePersonalFunds: Double?,

        @SerializedName("html_url")
        @Expose
        val htmlUrl: String?,

        @SerializedName("is_amended")
        @Expose
        val isAmended: Boolean?,

        @SerializedName("means_filed")
        @Expose
        val meansFiled: String?,

        @SerializedName("most_recent")
        @Expose
        val mostRecent: Boolean?,

        @SerializedName("most_recent_file_number")
        @Expose
        val mostRecentFileNumber: Int?,

        @SerializedName("net_donations")
        @Expose
        val netDonations: Double?,

        @SerializedName("opposition_personal_funds")
        @Expose
        val oppositionPersonalFunds: Double?,

        @SerializedName("pages")
        @Expose
        val pages: Int?,

        @SerializedName("pdf_url")
        @Expose
        val pdfUrl: String?,

        @SerializedName("previous_file_number")
        @Expose
        val previousFileNumber: Int?,

        @SerializedName("primary_general_indicator")
        @Expose
        val primaryGeneralIndicator: String?,

        @SerializedName("receipt_date")
        @Expose
        val receiptDate: String?,

        @SerializedName("report_type")
        @Expose
        val reportType: String?,

        @SerializedName("report_type_full")
        @Expose
        val reportTypeFull: String?,

        @SerializedName("report_year")
        @Expose
        val reportYear: Int?,

        @SerializedName("request_type")
        @Expose
        val requestType: String?,

        @SerializedName("senate_personal_funds")
        @Expose
        val senatePersonalFunds: Double?,

        @SerializedName("sub_id")
        @Expose
        val subId: String?,

        @SerializedName("total_communication_cost")
        @Expose
        val totalCommunicationCost: Double?,

        @SerializedName("total_disbursements")
        @Expose
        val totalDisbursements: Double?,

        @SerializedName("total_independent_expenditures")
        @Expose
        val totalIndependentExpenditures: Double?,

        @SerializedName("total_individual_contributions")
        @Expose
        val totalIndividualContributions: Double?,

        @SerializedName("total_receipts")
        @Expose
        val totalReceipts: Double?,

        @SerializedName("treasurer_name")
        @Expose
        val treasurerName: String?,

        @SerializedName("update_date")
        @Expose
        val updateDate: String?
)