package io.github.pace543.feckotlin.model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CandidateDetailPage(val pagination: OffsetInfo?, val results: List<CandidateDetail>?) {
    class Deserializer : ResponseDeserializable<CandidateDetailPage> {
        override fun deserialize(content: String): CandidateDetailPage? =
                Gson().fromJson(content, CandidateDetailPage::class.java)
    }
}

data class CandidateHistoryPage(val pagination: OffsetInfo?, val results: List<CandidateHistory>?) {
    class Deserializer : ResponseDeserializable<CandidateHistoryPage> {
        override fun deserialize(content: String): CandidateHistoryPage? =
                Gson().fromJson(content, CandidateHistoryPage::class.java)
    }
}

data class CommitteeTotalsPage(val pagination: OffsetInfo?, val results: List<CommitteeTotals>?) {
    class Deserializer : ResponseDeserializable<CommitteeTotalsPage> {
        override fun deserialize(content: String): CommitteeTotalsPage? =
                Gson().fromJson(content, CommitteeTotalsPage::class.java)
    }
}

data class CandidatePage(val pagination: OffsetInfo?, val results: List<Candidate>?) {
    class Deserializer : ResponseDeserializable<CandidatePage> {
        override fun deserialize(content: String): CandidatePage? =
                Gson().fromJson(content, CandidatePage::class.java)
    }
}

data class CandidateTotalsPage(val pagination: OffsetInfo?, val results: List<CandidateTotals>?) {
    class Deserializer : ResponseDeserializable<CandidateTotalsPage> {
        override fun deserialize(content: String): CandidateTotalsPage? =
                Gson().fromJson(content, CandidateTotalsPage::class.java)
    }
}

data class CandidateDetail(
        @SerializedName("active_through")
        @Expose
        val activeThrough: Int?,

        @SerializedName("address_city")
        @Expose
        val addressCity: String?,

        @SerializedName("address_state")
        @Expose
        val addressState: String?,

        @SerializedName("address_street_1")
        @Expose
        val addressStreet1: String?,

        @SerializedName("address_street_2")
        @Expose
        val addressStreet2: String?,

        @SerializedName("address_zip")
        @Expose
        val addressZip: String?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_inactive")
        @Expose
        val candidateInactive: Boolean?,

        @SerializedName("candidate_status")
        @Expose
        val candidateStatus: String?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("district")
        @Expose
        val district: String?,

        @SerializedName("district_number")
        @Expose
        val districtNumber: Int?,

        @SerializedName("election_districts")
        @Expose
        val electionDistricts: List<String>?,

        @SerializedName("election_years")
        @Expose
        val electionYears: List<Int>?,

        @SerializedName("federal_funds_flag")
        @Expose
        val federalFundsFlag: Boolean?,

        @SerializedName("flags")
        @Expose
        val flags: String?,

        @SerializedName("has_raised_funds")
        @Expose
        val hasRaisedFunds: Boolean?,

        @SerializedName("incumbent_challenge")
        @Expose
        val incumbentChallenge: String?,

        @SerializedName("incumbent_challenge_full")
        @Expose
        val incumbentChallengeFull: String?,

        @SerializedName("load_date")
        @Expose
        val loadDate: String?,

        @SerializedName("name")
        @Expose
        val name: String?,

        @SerializedName("office")
        @Expose
        val office: String?,

        @SerializedName("office_full")
        @Expose
        val officeFull: String?,

        @SerializedName("party")
        @Expose
        val party: String?,

        @SerializedName("party_full")
        @Expose
        val partyFull: String?,

        @SerializedName("state")
        @Expose
        val state: String?
)

data class CandidateHistory(
        @SerializedName("address_city")
        @Expose
        val addressCity: String?,

        @SerializedName("address_state")
        @Expose
        val addressState: String?,

        @SerializedName("address_street_1")
        @Expose
        val addressStreet1: String?,

        @SerializedName("address_street_2")
        @Expose
        val addressStreet2: String?,

        @SerializedName("address_zip")
        @Expose
        val addressZip: String?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_inactive")
        @Expose
        val candidateInactive: Boolean?,

        @SerializedName("candidate_status")
        @Expose
        val candidateStatus: String?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("district")
        @Expose
        val district: String?,

        @SerializedName("district_number")
        @Expose
        val districtNumber: Int?,

        @SerializedName("election_districts")
        @Expose
        val electionDistricts: List<String>?,

        @SerializedName("election_years")
        @Expose
        val electionYears: List<Int>?,

        @SerializedName("flags")
        @Expose
        val flags: String?,

        @SerializedName("incumbent_challenge")
        @Expose
        val incumbentChallenge: String?,

        @SerializedName("incumbent_challenge_full")
        @Expose
        val incumbentChallengeFull: String?,

        @SerializedName("load_date")
        @Expose
        val loadDate: String?,

        @SerializedName("name")
        @Expose
        val name: String?,

        @SerializedName("office")
        @Expose
        val office: String?,

        @SerializedName("office_full")
        @Expose
        val officeFull: String?,

        @SerializedName("party")
        @Expose
        val party: String?,

        @SerializedName("party_full")
        @Expose
        val partyFull: String?,

        @SerializedName("state")
        @Expose
        val state: String?,

        @SerializedName("two_year_period")
        @Expose
        val twoYearPeriod: Int?
)

data class CommitteeTotals(
        @SerializedName("all_loans_received")
        @Expose
        val allLoansReceived: Double?,

        @SerializedName("all_other_loans")
        @Expose
        val allOtherLoans: Double?,

        @SerializedName("allocated_federal_election_levin_share")
        @Expose
        val allocatedFederalElectionLevinShare: Double?,

        @SerializedName("candidate_contribution")
        @Expose
        val candidateContribution: Double?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("cash_on_hand_beginning_period")
        @Expose
        val cashOnHandBeginningPeriod: Double?,

        @SerializedName("committee_id")
        @Expose
        val committeeId: String?,

        @SerializedName("committee_name")
        @Expose
        val committeeName: String?,

        @SerializedName("committee_type")
        @Expose
        val committeeType: String?,

        @SerializedName("contribution_refunds")
        @Expose
        val contributionRefunds: Double?,

        @SerializedName("contributions")
        @Expose
        val contributions: Double?,

        @SerializedName("coordinated_expenditures_by_party_committee")
        @Expose
        val coordinatedExpendituresByPartyCommittee: Double?,

        @SerializedName("coverage_end_date")
        @Expose
        val coverageEndDate: String?,

        @SerializedName("coverage_start_date")
        @Expose
        val coverageStartDate: String?,

        @SerializedName("cycle")
        @Expose
        val cycle: Int?,

        @SerializedName("disbursements")
        @Expose
        val disbursements: Double?,

        @SerializedName("exempt_legal_accounting_disbursement")
        @Expose
        val exemptLegalAccountingDisbursement: Double?,

        @SerializedName("fed_candidate_committee_contributions")
        @Expose
        val fedCandidateCommitteeContributions: Double?,

        @SerializedName("fed_candidate_contribution_refunds")
        @Expose
        val fedCandidateContributionRefunds: Double?,

        @SerializedName("fed_disbursements")
        @Expose
        val fedDisbursements: Double?,

        @SerializedName("fed_election_activity")
        @Expose
        val fedElectionActivity: Double?,

        @SerializedName("fed_operating_expenditures")
        @Expose
        val fedOperatingExpenditures: Double?,

        @SerializedName("fed_receipts")
        @Expose
        val fedReceipts: Double?,

        @SerializedName("federal_funds")
        @Expose
        val federalFunds: Double?,

        @SerializedName("full_election")
        @Expose
        val fullElection: Boolean?,

        @SerializedName("fundraising_disbursements")
        @Expose
        val fundraisingDisbursements: Double?,

        @SerializedName("independent_expenditures")
        @Expose
        val independentExpenditures: Double?,

        @SerializedName("individual_contributions")
        @Expose
        val individualContributions: Double?,

        @SerializedName("individual_itemized_contributions")
        @Expose
        val individualItemizedContributions: Double?,

        @SerializedName("individual_unitemized_contributions")
        @Expose
        val individualUnitemizedContributions: Double?,

        @SerializedName("last_beginning_image_number")
        @Expose
        val lastBeginningImageNumber: String?,

        @SerializedName("last_cash_on_hand_end_period")
        @Expose
        val lastCashOnHandEndPeriod: Double?,

        @SerializedName("last_debts_owed_by_committee")
        @Expose
        val lastDebtsOwedByCommittee: Double?,

        @SerializedName("last_debts_owed_to_committee")
        @Expose
        val lastDebtsOwedToCommittee: Double?,

        @SerializedName("last_report_type_full")
        @Expose
        val lastReportTypeFull: String?,

        @SerializedName("last_report_year")
        @Expose
        val lastReportYear: Int?,

        @SerializedName("loan_repayments")
        @Expose
        val loanRepayments: Double?,

        @SerializedName("loan_repayments_candidate_loans")
        @Expose
        val loanRepaymentsCandidateLoans: Double?,

        @SerializedName("loan_repayments_made")
        @Expose
        val loanRepaymentsMade: Double?,

        @SerializedName("loan_repayments_other_loans")
        @Expose
        val loanRepaymentsOtherLoans: Double?,

        @SerializedName("loan_repayments_received")
        @Expose
        val loanRepaymentsReceived: Double?,

        @SerializedName("loans")
        @Expose
        val loans: Double?,

        @SerializedName("loans_made")
        @Expose
        val loansMade: Double?,

        @SerializedName("loans_made_by_candidate")
        @Expose
        val loansMadeByCandidate: Double?,

        @SerializedName("loans_received")
        @Expose
        val loansReceived: Double?,

        @SerializedName("loans_received_from_candidate")
        @Expose
        val loansReceivedFromCandidate: Double?,

        @SerializedName("net_contributions")
        @Expose
        val netContributions: Double?,

        @SerializedName("net_operating_expenditures")
        @Expose
        val netOperatingExpenditures: Double?,

        @SerializedName("non_allocated_fed_election_activity")
        @Expose
        val nonAllocatedFedElectionActivity: Double?,

        @SerializedName("offsets_to_fundraising_expenditures")
        @Expose
        val offsetsToFundraisingExpenditures: Double?,

        @SerializedName("offsets_to_legal_accounting")
        @Expose
        val offsetsToLegalAccounting: Double?,

        @SerializedName("offsets_to_operating_expenditures")
        @Expose
        val offsetsToOperatingExpenditures: Double?,

        @SerializedName("operating_expenditures")
        @Expose
        val operatingExpenditures: Double?,

        @SerializedName("other_disbursements")
        @Expose
        val otherDisbursements: Double?,

        @SerializedName("other_fed_operating_expenditures")
        @Expose
        val otherFedOperatingExpenditures: Double?,

        @SerializedName("other_fed_receipts")
        @Expose
        val otherFedReceipts: Double?,

        @SerializedName("other_loans_received")
        @Expose
        val otherLoansReceived: Double?,

        @SerializedName("other_political_committee_contributions")
        @Expose
        val otherPoliticalCommitteeContributions: Double?,

        @SerializedName("other_receipts")
        @Expose
        val otherReceipts: Double?,

        @SerializedName("pdf_url")
        @Expose
        val pdfUrl: String?,

        @SerializedName("political_party_committee_contributions")
        @Expose
        val politicalPartyCommitteeContributions: Double?,

        @SerializedName("receipts")
        @Expose
        val receipts: Double?,

        @SerializedName("refunded_individual_contributions")
        @Expose
        val refundedIndividualContributions: Double?,

        @SerializedName("refunded_other_political_committee_contributions")
        @Expose
        val refundedOtherPoliticalCommitteeContributions: Double?,

        @SerializedName("refunded_political_party_committee_contributions")
        @Expose
        val refundedPoliticalPartyCommitteeContributions: Double?,

        @SerializedName("repayments_loans_made_by_candidate")
        @Expose
        val repaymentsLoansMadeByCandidate: Double?,

        @SerializedName("repayments_other_loans")
        @Expose
        val repaymentsOtherLoans: Double?,

        @SerializedName("report_form")
        @Expose
        val reportForm: String?,

        @SerializedName("shared_fed_activity")
        @Expose
        val sharedFedActivity: Double?,

        @SerializedName("shared_fed_activity_nonfed")
        @Expose
        val sharedFedActivityNonfed: Double?,

        @SerializedName("shared_fed_operating_expenditures")
        @Expose
        val sharedFedOperatingExpenditures: Double?,

        @SerializedName("shared_nonfed_operating_expenditures")
        @Expose
        val sharedNonfedOperatingExpenditures: Double?,

        @SerializedName("total_independent_contributions")
        @Expose
        val totalIndependentContributions: Double?,

        @SerializedName("total_independent_expenditures")
        @Expose
        val totalIndependentExpenditures: Double?,

        @SerializedName("total_offsets_to_operating_expenditures")
        @Expose
        val totalOffsetsToOperatingExpenditures: Double?,

        @SerializedName("total_transfers")
        @Expose
        val totalTransfers: Double?,

        @SerializedName("transfers_from_affiliated_committee")
        @Expose
        val transfersFromAffiliatedCommittee: Double?,

        @SerializedName("transfers_from_affiliated_party")
        @Expose
        val transfersFromAffiliatedParty: Double?,

        @SerializedName("transfers_from_nonfed_account")
        @Expose
        val transfersFromNonfedAccount: Double?,

        @SerializedName("transfers_from_nonfed_levin")
        @Expose
        val transfersFromNonfedLevin: Double?,

        @SerializedName("transfers_from_other_authorized_committee")
        @Expose
        val transfersFromOtherAuthorizedCommittee: Double?,

        @SerializedName("transfers_to_affiliated_committee")
        @Expose
        val transfersToAffiliatedCommittee: Double?,

        @SerializedName("transfers_to_other_authorized_committee")
        @Expose
        val transfersToOtherAuthorizedCommittee: Double?
)

data class Candidate(
        @SerializedName("active_through")
        @Expose
        val activeThrough: Int?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_status")
        @Expose
        val candidateStatus: String?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("district")
        @Expose
        val district: String?,

        @SerializedName("district_number")
        @Expose
        val districtNumber: Int?,

        @SerializedName("election_districts")
        @Expose
        val electionDistricts: List<String>?,

        @SerializedName("election_years")
        @Expose
        val electionYears: List<Int>?,

        @SerializedName("federal_funds_flag")
        @Expose
        val federalFundsFlag: Boolean?,

        @SerializedName("flags")
        @Expose
        val flags: String?,

        @SerializedName("has_raised_funds")
        @Expose
        val hasRaisedFunds: Boolean?,

        @SerializedName("incumbent_challenge")
        @Expose
        val incumbentChallenge: String?,

        @SerializedName("incumbent_challenge_full")
        @Expose
        val incumbentChallengeFull: String?,

        @SerializedName("load_date")
        @Expose
        val loadDate: String?,

        @SerializedName("name")
        @Expose
        val name: String?,

        @SerializedName("office")
        @Expose
        val office: String?,

        @SerializedName("office_full")
        @Expose
        val officeFull: String?,

        @SerializedName("party")
        @Expose
        val party: String?,

        @SerializedName("party_full")
        @Expose
        val partyFull: String?,

        @SerializedName("principal_committees")
        @Expose
        val principalCommittees: List<Committee>?,

        @SerializedName("state")
        @Expose
        val state: String?
)

data class CandidateTotals(
        @SerializedName("address_city")
        @Expose
        val addressCity: String?,

        @SerializedName("address_state")
        @Expose
        val addressState: String?,

        @SerializedName("address_street_1")
        @Expose
        val addressStreet1: String?,

        @SerializedName("address_street_2")
        @Expose
        val addressStreet2: String?,

        @SerializedName("address_zip")
        @Expose
        val addressZip: String?,

        @SerializedName("candidate_id")
        @Expose
        val candidateId: String?,

        @SerializedName("candidate_inactive")
        @Expose
        val candidateInactive: Boolean?,

        @SerializedName("candidate_status")
        @Expose
        val candidateStatus: String?,

        @SerializedName("cash_on_hand_end_period")
        @Expose
        val cashOnHandEndPeriod: Double?,

        @SerializedName("coverage_end_date")
        @Expose
        val coverageEndDate: String?,

        @SerializedName("coverage_start_date")
        @Expose
        val coverageStartDate: String?,

        @SerializedName("cycle")
        @Expose
        val cycle: Int?,

        @SerializedName("cycles")
        @Expose
        val cycles: List<Int>?,

        @SerializedName("debts_owed_by_committee")
        @Expose
        val debtsOwedByCommittee: Double?,

        @SerializedName("disbursements")
        @Expose
        val disbursements: Double?,

        @SerializedName("district")
        @Expose
        val district: String?,

        @SerializedName("district_number")
        @Expose
        val districtNumber: Int?,

        @SerializedName("election_districts")
        @Expose
        val electionDistricts: List<String>?,

        @SerializedName("election_year")
        @Expose
        val electionYear: Int?,

        @SerializedName("election_years")
        @Expose
        val electionYears: List<Int>?,

        @SerializedName("federal_funds_flag")
        @Expose
        val federalFundsFlag: Boolean?,

        @SerializedName("flags")
        @Expose
        val flags: String?,

        @SerializedName("has_raised_funds")
        @Expose
        val hasRaisedFunds: Boolean?,

        @SerializedName("incumbent_challenge")
        @Expose
        val incumbentChallenge: String?,

        @SerializedName("incumbent_challenge_full")
        @Expose
        val incumbentChallengeFull: String?,

        @SerializedName("is_election")
        @Expose
        val isElection: Boolean?,

        @SerializedName("load_date")
        @Expose
        val loadDate: String?,

        @SerializedName("name")
        @Expose
        val name: String?,

        @SerializedName("office")
        @Expose
        val office: String?,

        @SerializedName("office_full")
        @Expose
        val officeFull: String?,

        @SerializedName("party")
        @Expose
        val party: String?,

        @SerializedName("party_full")
        @Expose
        val partyFull: String?,

        @SerializedName("receipts")
        @Expose
        val receipts: Double?,

        @SerializedName("state")
        @Expose
        val state: String?,

        @SerializedName("two_year_period")
        @Expose
        val twoYearPeriod: Int?
)