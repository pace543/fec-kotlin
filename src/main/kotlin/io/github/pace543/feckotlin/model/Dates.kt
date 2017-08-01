package io.github.pace543.feckotlin.model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CalendarDatePage(val pagination: OffsetInfo?, val results: List<CalendarDate>?) {
    class Deserializer : ResponseDeserializable<CalendarDatePage> {
        override fun deserialize(content: String): CalendarDatePage? =
                Gson().fromJson(content, CalendarDatePage::class.java)
    }
}

data class ElectionDatePage(val pagination: OffsetInfo?, val results: List<ElectionDate>?) {
    class Deserializer : ResponseDeserializable<ElectionDatePage> {
        override fun deserialize(content: String): ElectionDatePage? =
                Gson().fromJson(content, ElectionDatePage::class.java)
    }
}

data class ReportDatePage(val pagination: OffsetInfo?, val results: List<ReportDate>?) {
    class Deserializer : ResponseDeserializable<ReportDatePage> {
        override fun deserialize(content: String): ReportDatePage? =
            Gson().fromJson(content, ReportDatePage::class.java)
    }
}

data class OffsetInfo(
    @SerializedName("count")
    @Expose()
    val count: Int?,

    @SerializedName("page")
    @Expose()
    val page: Int?,

    @SerializedName("pages")
    @Expose()
    val pages: Int?,

    @SerializedName("per_page")
    @Expose()
    val perPage: Int?
)

data class CalendarDate(
    @SerializedName("all_day")
    @Expose()
    val allDay: Boolean?,

    @SerializedName("category")
    @Expose()
    val category: String?,

    @SerializedName("description")
    @Expose()
    val description: String?,

    @SerializedName("end_date")
    @Expose()
    val endDate: String?,

    @SerializedName("location")
    @Expose()
    val location: String?,

    @SerializedName("start_date")
    @Expose()
    val startDate: String?,

    @SerializedName("state")
    @Expose()
    val state: List<String>?,

    @SerializedName("summary")
    @Expose()
    val summary: String?,

    @SerializedName("url")
    @Expose()
    val url: String?
)

data class ElectionDate(
    @SerializedName("active_election")
    @Expose()
    val activeElection: Boolean?,

    @SerializedName("create_date")
    @Expose()
    val createDate: String?,

    @SerializedName("election_date")
    @Expose()
    val electionDate: String?,

    @SerializedName("election_district")
    @Expose()
    val electionDistrict: Int?,

    @SerializedName("election_notes")
    @Expose()
    val electionNotes: String?,

    @SerializedName("election_party")
    @Expose()
    val electionParty: String?,

    @SerializedName("election_state")
    @Expose()
    val electionState: String?,

    @SerializedName("election_type_full")
    @Expose()
    val electionTypeFull: String?,

    @SerializedName("election_type_id")
    @Expose()
    val electionTypeId: String?,

    @SerializedName("election_year")
    @Expose()
    val electionYear: Int?,

    @SerializedName("office_sought")
    @Expose()
    val officeSought: String?,

    @SerializedName("primary_general_date")
    @Expose()
    val primaryGeneralDate: String?,

    @SerializedName("update_date")
    @Expose()
    val updateDate: String?
)

data class ReportDate(
    @SerializedName("create_date")
    @Expose()
    val createDate: String?,

    @SerializedName("due_date")
    @Expose()
    val dueDate: String?,

    @SerializedName("report_type")
    @Expose()
    val reportType: String?,

    @SerializedName("report_type_full")
    @Expose()
    val reportTypeFull: String?,

    @SerializedName("report_year")
    @Expose()
    val reportYear: Int?,

    @SerializedName("update_date")
    @Expose()
    val updateDate: String?
)