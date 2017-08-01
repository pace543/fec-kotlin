package io.github.pace543.feckotlin

import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.rx.rx_object
import com.github.kittinunf.result.Result
import io.github.pace543.feckotlin.model.CalendarDatePage
import io.github.pace543.feckotlin.model.ElectionDatePage
import io.github.pace543.feckotlin.model.ReportDatePage
import io.reactivex.Single

class Client(key: String) {
    init {
        FuelManager.instance.basePath = "https://api.open.fec.gov/v1"
        FuelManager.instance.baseParams = listOf("api_key" to key)
    }

    // /dates/ endpoints
    fun getCalendarDates(params: ParamsList? = null): OpenFECResult<CalendarDatePage> =
            "/calendar-dates".httpGet(params).rx_object(CalendarDatePage.Deserializer())
    fun getElectionDates(params: ParamsList? = null): OpenFECResult<ElectionDatePage> =
            "/election-dates".httpGet(params).rx_object(ElectionDatePage.Deserializer())
    fun getReportingDates(params: ParamsList? = null): OpenFECResult<ReportDatePage> =
            "/reporting-dates".httpGet(params).rx_object(ReportDatePage.Deserializer())

    // /candidate/ endpoints
    fun getCandidate(candidateId: String, params: ParamsList): OpenFECResult<CandidateDetailPage>
    fun getCandidateHistory(candidateId: String, params: ParamsList): OpenFECResult<CandidateHistoryPage>
    fun getCandidateHistoryByCycle(candidateId: String, cycle: Int, params: ParamsList): OpenFECResult<CandidateHistoryPage>
    fun getCandidateTotals(candidateId: String, params: ParamsList): OpenFECResult<CommitteeResultsPage>
    fun getCandidates(params: ParamsList): OpenFECResult<CandidatePage>
    fun getCandidatesSearch(params: ParamsList): OpenFECResult<CandidatePage>
    fun getCandidatesTotals(params: ParamsList): OpenFECResult<CandidateTotalsPage>
    fun getCandidatesFromCommittee(committeeId: String, params: ParamsList): OpenFECResult<CandidateDetailPage>
    fun getCandidatesHistoryFromCommittee(committeeId: String, params: ParamsList): OpenFECResult<CandidateHistoryPage>
    fun getCandidatesHistoryByCycleFromCommittee(committeeId: String, cycle: Int, params: ParamsList): OpenFECResult<CandidateHistoryPage>

    // /committee/ endpoints
    fun getCommitteesFromCandidate(candidateId: String, params: ParamsList)
    fun getCommitteesHistoryFromCandidate(candidateId: String, params: ParamsList)
    fun getCommitteesHistoryByCycleFromCandidate(candidateId: String, cycle: Int, params: ParamsList)
    fun getCommittee(committeeId: String, params: ParamsList)
    fun getCommitteeHistory(committeeId: String, params: ParamsList)
    fun getCommitteeHistoryByCycle(committeeId: String, cycle: Int, params: ParamsList)
    fun getCommittees(params: ParamsList)

    // /filings/ endpoints
    fun getFilingsFromCandidate(candidateId: String, params: ParamsList)
    fun getFilingsFromCommittee(committeeId: String, params: ParamsList)
    fun getFilings(params: ParamsList)

    // /communication costs/ endpoints
    fun getCommunicationCostsByCandidateFromCommittee(committeeId: String, params: ParamsList)
    fun getCommunicationCosts(params: ParamsList)
    fun getCommunicationCostsByCandidate(params: ParamsList)

    // /electioneering/ endpoints
    fun getElectioneeringByCandidateFromCommittee(committeeId: String, params: ParamsList)
    fun getELectioneering(params: ParamsList)
    fun getElectioneeringByCandidate(params: ParamsList)

    // /financial/ endpoints
    fun getReportsFromCommittee(committeeId: String, params: ParamsList)
    fun getTotalsFromCommittee(committeeId: String, params: ParamsList)
    fun getElections(params: ParamsList)
    fun getElectionsSearch(params: ParamsList)
    fun getElectionsSummary(params: ParamsList)
    fun getReportsByCommitteeType(committeeType: String, params: ParamsList)
    fun getTotalsByEntity(params: ParamsList)
    fun getTotalsByCommitteeType(committeeType: String, params: ParamsList)

    // /receipts/ endpoints
    fun getScheduleAByEmployerFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleAByOccupationFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleABySizeFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleAByStateFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleAByZipFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleA(params: ParamsList)
    fun getScheduleAByEmployer(params: ParamsList)
    fun getScheduleAByOccupation(params: ParamsList)
    fun getScheduleABySize(params: ParamsList)
    fun getScheduleABySizeByCandidate(params: ParamsList)
    fun getScheduleAByState(params: ParamsList)
    fun getScheduleAByStateByCandidate(params: ParamsList)
    fun getScheduleAByStateTotals(params: ParamsList)
    fun getScheduleAByZip(params: ParamsList)
    fun getScheduleAEFile(params: ParamsList)
    fun getScheduleAFromSubId(subId: String, params: ParamsList)

    // /disbursements/ endpoints
    fun getScheduleBByPurposeFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleBByRecipientFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleBByRecipientIdFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleB(params: ParamsList)
    fun getScheduleBByPurpose(params: ParamsList)
    fun getScheduleBByRecipient(params: ParamsList)
    fun getScheduleBByRecipientId(params: ParamsList)
    fun getScheduleBEFile(params: ParamsList)
    fun getScheduleBFromSubId(subId: String, params: ParamsList)

    // /independent expenditures/ endpoints
    fun getScheduleEByCandidateFromCommittee(committeeId: String, params: ParamsList)
    fun getScheduleE(params: ParamsList)
    fun getScheduleEByCandidate(params: ParamsList)
    fun getScheduleEEFile(params: ParamsList)

    // /efiling/ endpoints
    fun getEfileFilings(params: ParamsList)
    fun getEfileReportsByCommitteeType(committeeType: String, params: ParamsList)

    // /search/ endpoints
    fun searchCandidatesByName(params: ParamsList)
    fun searchCommitteesByName(params: ParamsList)

    // /filer resources/ endpoint
    fun getRadAnalyst(params: ParamsList)

    // /loans/ endpoints
    fun getScheduleC(params: ParamsList)
    fun getScheduleCFromSubId(subId: String, params: ParamsList)

    // /debts/ endpoints
    fun getScheduleD(params: ParamsList)
    fun getScheduleDFromSubId(subId: String, params: ParamsList)

    // /party-coordinated expenditures/ endpoints
    fun getScheduleF(params: ParamsList)
    fun getScheduleFFromSubId(subId: String, params: ParamsList)
}

typealias ParamsList = List<Pair<String, Any?>>
typealias OpenFECResult<T> = Single<Result<T, FuelError>>