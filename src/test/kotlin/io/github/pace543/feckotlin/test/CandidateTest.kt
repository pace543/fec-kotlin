package io.github.pace543.feckotlin.test

import io.github.pace543.feckotlin.model.*
import org.junit.Assert.*
import org.junit.Test

class CandidateTest {
    @Test
    fun testGetCandidate() {
        mockClient.getCandidate("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 1, page = 1, perPage = 20, count = 1), data.pagination)
                val result = data.results?.get(0) as CandidateDetail
                assertEquals("President", result.officeFull)
                assertEquals("P", result.office)
                assertEquals("O", result.incumbentChallenge)
                assertEquals("00", result.district)
                assertEquals(listOf(2016), result.electionYears)
                assertEquals("2017-05-23T07:10:19", result.loadDate)
                assertEquals("05408", result.addressZip)
                assertTrue(result.hasRaisedFunds!!)
                assertFalse(result.federalFundsFlag!!)
                assertEquals("DEMOCRATIC PARTY", result.partyFull)
                assertEquals("P60007168", result.candidateId)
                assertEquals("VT", result.addressState)
                assertEquals("DEM", result.party)
                assertEquals(2016, result.activeThrough)
                assertEquals("US", result.state)
                assertEquals("221 VAN PATTEN PKWY", result.addressStreet1)
                assertEquals(listOf("00"), result.electionDistricts)
                assertEquals("Open seat", result.incumbentChallengeFull)
                assertNull(result.addressStreet2)
                assertEquals("BURLINGTON", result.addressCity)
                assertEquals("SANDERS, BERNARD", result.name)
                assertEquals("P60007168", result.flags)
                assertEquals(0, result.districtNumber)
                assertEquals(listOf(2016, 2018), result.cycles)
                assertEquals("P", result.candidateStatus)
                assertFalse(result.candidateInactive!!)
            }
        }
    }

    @Test
    fun testGetCandidateHistory() {
        mockClient.getCandidateHistory("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 1, page = 1, perPage = 20, count = 2), data.pagination)
                val result = data.results?.get(0) as CandidateHistory
                assertEquals("President", result.officeFull)
                assertEquals("P", result.office)
                assertEquals("O", result.incumbentChallenge)
                assertEquals("00", result.district)
                assertEquals(listOf(2016), result.electionYears)
                assertEquals("2017-05-23T07:10:19", result.loadDate)
                assertEquals("05408", result.addressZip)
                assertEquals("DEMOCRATIC PARTY", result.partyFull)
                assertEquals("P60007168", result.candidateId)
                assertEquals("VT", result.addressState)
                assertEquals("DEM", result.party)
                assertEquals("US", result.state)
                assertEquals("221 VAN PATTEN PKWY", result.addressStreet1)
                assertEquals(listOf("00"), result.electionDistricts)
                assertEquals("Open seat", result.incumbentChallengeFull)
                assertNull(result.addressStreet2)
                assertEquals("BURLINGTON", result.addressCity)
                assertEquals("SANDERS, BERNARD", result.name)
                assertEquals("P60007168", result.flags)
                assertEquals(0, result.districtNumber)
                assertEquals(listOf(2016, 2018), result.cycles)
                assertEquals("P", result.candidateStatus)
                assertFalse(result.candidateInactive!!)
                assertEquals(2018, result.twoYearPeriod)
            }
        }
    }

    @Test
    fun testGetCandidateHistoryByCycle() {
        mockClient.getCandidateHistoryByCycle("P60007168", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 1, page = 1, perPage = 20, count = 1), data.pagination)
                val result = data.results?.get(0) as CandidateHistory
                assertEquals("President", result.officeFull)
                assertEquals("P", result.office)
                assertEquals("O", result.incumbentChallenge)
                assertEquals("00", result.district)
                assertEquals(listOf(2016), result.electionYears)
                assertEquals("2016-11-17T06:10:49", result.loadDate)
                assertEquals("05408", result.addressZip)
                assertEquals("DEMOCRATIC PARTY", result.partyFull)
                assertEquals("P60007168", result.candidateId)
                assertEquals("VT", result.addressState)
                assertEquals("DEM", result.party)
                assertEquals("US", result.state)
                assertEquals("221 VAN PATTEN PKWY", result.addressStreet1)
                assertEquals(listOf("00"), result.electionDistricts)
                assertEquals("Open seat", result.incumbentChallengeFull)
                assertNull(result.addressStreet2)
                assertEquals("BURLINGTON", result.addressCity)
                assertEquals("SANDERS, BERNARD", result.name)
                assertEquals("P60007168", result.flags)
                assertEquals(0, result.districtNumber)
                assertEquals(listOf(2016, 2018), result.cycles)
                assertEquals("C", result.candidateStatus)
                assertFalse(result.candidateInactive!!)
                assertEquals(2016, result.twoYearPeriod)
            }
        }
    }

    @Test
    fun testGetCandidateTotals() {
        mockClient.getCandidateTotals("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1, count = 4, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CommitteeTotals
                assertEquals(0.0, result.contributionRefunds)
                assertEquals(-12919.69, result.netContributions)
                assertFalse(result.fullElection!!)
                assertEquals(0.0, result.transfersToOtherAuthorizedCommittee)
                assertEquals(0.0, result.fundraisingDisbursements)
                assertEquals(1447.19, result.refundedIndividualContributions)
                assertEquals(1468.72, result.otherReceipts)
                assertEquals(0.0, result.offsetsToFundraisingExpenditures)
                assertEquals(0.0, result.politicalPartyCommitteeContributions)
                assertEquals(0.0, result.refundedOtherPoliticalCommitteeContributions)
                assertEquals(241188.26, result.operatingExpenditures)
                assertEquals(0.0, result.otherLoansReceived)
                assertEquals(0.0, result.individualItemizedContributions)
                assertEquals(10.0, result.individualUnitemizedContributions)
                assertEquals("2017-01-01T00:00:00+00:00", result.coverageStartDate)
                assertEquals(0.0, result.candidateContribution)
                assertEquals(0.0, result.lastDebtsOwedToCommittee)
                assertEquals(24189.07, result.totalOffsetsToOperatingExpenditures)
                assertEquals("201707149066658834", result.lastBeginningImageNumber)
                assertEquals(0.0, result.loansReceivedFromCandidate)
                assertEquals(2018, result.cycle)
                assertEquals(0.0, result.repaymentsOtherLoans)
                assertEquals(0.0, result.otherDisbursements)
                assertEquals(0.0, result.exemptLegalAccountingDisbursement)
                assertEquals(0.0, result.loansReceived)
                assertEquals(10.0, result.contributions)
                assertEquals(-516859.43, result.netOperatingExpenditures)
                assertEquals(0.0, result.loanRepaymentsMade)
                assertEquals(25667.79, result.receipts)
                assertEquals(0.0, result.transfersFromAffiliatedCommittee)
                assertEquals(0.0, result.otherPoliticalCommitteeContributions)
                assertEquals("P60007168", result.candidateId)
                assertEquals("JULY QUARTERLY", result.lastReportTypeFull)
                assertEquals(0.0, result.offsetsToLegalAccounting)
                assertEquals(10.0, result.individualContributions)
                assertEquals(0.0, result.repaymentsLoansMadeByCandidate)
                assertEquals(24189.07, result.offsetsToOperatingExpenditures)
                assertEquals(0.0, result.federalFunds)
                assertEquals(449409.01, result.lastDebtsOwedByCommittee)
                assertEquals(2017, result.lastReportYear)
                assertEquals(5238200.24, result.lastCashOnHandEndPeriod)
                assertEquals(0.0, result.refundedPoliticalPartyCommitteeContributions)
                assertEquals("2017-06-30T00:00:00+00:00", result.coverageEndDate)
                assertEquals(242635.45, result.disbursements)
            }
        }
    }

    @Test
    fun testGetCandidates() {
        mockClient.getCandidates().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1862, perPage = 20, count = 37237), data.pagination)
                val result = data.results?.get(0) as Candidate
                assertEquals(listOf(2004), result.electionYears)
                assertEquals(0, result.districtNumber)
                assertEquals("P40002172", result.candidateId)
                assertEquals("N", result.candidateStatus)
                assertEquals("President", result.officeFull)
                assertEquals("Challenger", result.incumbentChallengeFull)
                assertEquals(2004, result.activeThrough)
                assertEquals(listOf("00"), result.electionDistricts)
                assertEquals(listOf(2002, 2004), result.cycles)
                assertEquals("IND", result.party)
                assertEquals("2002-04-12T00:00:00", result.loadDate)
                assertEquals("C", result.incumbentChallenge)
                assertEquals("AABBATTE, MICHAEL THOMAS WITORT", result.name)
                assertEquals("US", result.state)
                assertEquals("P40002172", result.flags)
                assertEquals("P", result.office)
                assertFalse(result.federalFundsFlag!!)
                assertFalse(result.hasRaisedFunds!!)
                assertEquals("INDEPENDENT", result.partyFull)
                assertEquals("00", result.district)
            }
        }
    }

    @Test
    fun testGetCandidatesSearch() {
        mockClient.getCandidatesSearch().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1862, perPage = 20, count = 37237), data.pagination)
                val result = data.results?.get(0) as Candidate
                assertEquals(listOf(2014), result.electionYears)
                assertEquals(4, result.districtNumber)
                assertEquals("H4UT04052", result.candidateId)
                assertEquals("N", result.candidateStatus)
                assertEquals("House", result.officeFull)
                assertEquals("Open seat", result.incumbentChallengeFull)
                assertEquals(emptyList<Committee>(), result.principalCommittees)
                assertEquals(listOf("04"), result.electionDistricts)
                assertEquals(listOf(2014), result.cycles)
                assertEquals("IAP", result.party)
                assertEquals("2014-03-22T21:40:34", result.loadDate)
                assertEquals("O", result.incumbentChallenge)
                assertEquals("AALDERS, TIM", result.name)
                assertEquals("UT", result.state)
                assertEquals("INDEPENDENT AMERICAN PARTY", result.partyFull)
                assertEquals("H", result.office)
                assertFalse(result.federalFundsFlag!!)
                assertFalse(result.hasRaisedFunds!!)
                assertEquals(2014, result.activeThrough)
                assertEquals("04", result.district)
            }
        }
    }

    @Test
    fun testGetCandidatesTotals() {
        mockClient.getCandidatesTotals().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 2610, perPage = 20, count = 52200), data.pagination)
                val result = data.results?.get(0) as CandidateTotals
                assertEquals("99901", result.addressZip)
                assertEquals("House", result.officeFull)
                assertNull(result.incumbentChallenge)
                assertEquals("00", result.district)
                assertEquals(listOf(1980), result.electionYears)
                assertEquals("2002-03-30T00:00:00", result.loadDate)
                assertFalse(result.isElection!!)
                assertFalse(result.federalFundsFlag!!)
                assertEquals(1116.0, result.receipts)
                assertTrue(result.hasRaisedFunds!!)
                assertEquals("DEMOCRATIC PARTY", result.partyFull)
                assertEquals("H0AK00014", result.candidateId)
                assertEquals("H", result.office)
                assertEquals(1980, result.cycle)
                assertEquals("AK", result.addressState)
                assertEquals("DEM", result.party)
                assertEquals("1980-10-15T00:00:00", result.coverageEndDate)
                assertEquals(1980, result.electionYear)
                assertEquals("RT 1/BOX 198", result.addressStreet1)
                assertFalse(result.candidateInactive!!)
                assertNull(result.incumbentChallengeFull)
                assertEquals(listOf("00"), result.electionDistricts)
                assertNull(result.coverageStartDate)
                assertNull(result.cashOnHandEndPeriod)
                assertEquals("KETCHIKAW", result.addressCity)
                assertEquals("WHITTAKER, RICHARD", result.name)
                assertNull(result.debtsOwedByCommittee)
                assertEquals(0, result.districtNumber)
                assertEquals(listOf(1980), result.cycles)
                assertEquals(1980, result.twoYearPeriod)
                assertEquals("C", result.candidateStatus)
                assertEquals(764.0, result.disbursements)
                assertNull(result.addressStreet2)
            }
        }
    }

    @Test
    fun testGetCandidatesFromCommittee() {
        mockClient.getCandidatesFromCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1, count = 1, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CandidateDetail
                assertEquals("S", result.office)
                assertEquals(listOf("00", "00", "00", "00"), result.electionDistricts)
                assertEquals(listOf(1976, 2006, 2012, 2018), result.electionYears)
                assertEquals("BURLINGTON", result.addressCity)
                assertEquals("S4VT00033", result.candidateId)
                assertEquals("C", result.candidateStatus)
                assertNull(result.addressZip)
                assertEquals("INDEPENDENT", result.partyFull)
                assertEquals("Incumbent", result.incumbentChallengeFull)
                assertFalse(result.candidateInactive!!)
                assertEquals("IND", result.party)
                assertEquals(listOf(1976, 2006, 2008, 2010, 2012, 2014, 2016, 2018), result.cycles)
                assertEquals("I", result.incumbentChallenge)
                assertEquals("Senate", result.officeFull)
                assertNull(result.addressStreet1)
                assertEquals("S4VT00033", result.flags)
                assertEquals(0, result.districtNumber)
                assertFalse(result.federalFundsFlag!!)
                assertNull(result.addressStreet2)
                assertTrue(result.hasRaisedFunds!!)
                assertEquals("VT", result.state)
                assertEquals("SANDERS, BERNARD", result.name)
                assertEquals("2017-05-23T07:10:20", result.loadDate)
                assertEquals(2018, result.activeThrough)
                assertEquals("00", result.district)
                assertEquals("VT", result.addressState)
            }
        }
    }

    @Test
    fun testGetCandidatesHistoryFromCommittee() {
        mockClient.getCandidatesHistoryFromCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, perPage = 20, pages = 1, count = 8), data.pagination)
                val result = data.results?.get(0) as CandidateHistory
                assertEquals("S", result.office)
                assertEquals(listOf("00", "00", "00", "00"), result.electionDistricts)
                assertEquals(listOf(1976, 2006, 2012, 2018), result.electionYears)
                assertEquals("BURLINGTON", result.addressCity)
                assertEquals("S4VT00033", result.candidateId)
                assertEquals("C", result.candidateStatus)
                assertNull(result.addressZip)
                assertEquals("INDEPENDENT", result.partyFull)
                assertEquals("Incumbent", result.incumbentChallengeFull)
                assertFalse(result.candidateInactive!!)
                assertEquals("IND", result.party)
                assertEquals(listOf(1976, 2006, 2008, 2010, 2012, 2014, 2016, 2018), result.cycles)
                assertEquals("I", result.incumbentChallenge)
                assertEquals("Senate", result.officeFull)
                assertNull(result.addressStreet1)
                assertEquals("S4VT00033", result.flags)
                assertEquals(0, result.districtNumber)
                assertNull(result.addressStreet2)
                assertEquals("SANDERS, BERNARD", result.name)
                assertEquals("2017-05-23T07:10:20", result.loadDate)
                assertEquals("VT", result.state)
                assertEquals("00", result.district)
                assertEquals("VT", result.addressState)
                assertEquals(2018, result.twoYearPeriod)
            }
        }
    }

    @Test
    fun testGetCandidatesHistoryByCycleFromCommittee() {
        mockClient.getCandidatesHistoryByCycleFromCommittee("C00411330", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1, count = 1, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CandidateHistory
                assertEquals("S", result.office)
                assertEquals(listOf("00", "00", "00", "00"), result.electionDistricts)
                assertEquals(listOf(1976, 2006, 2012, 2018), result.electionYears)
                assertEquals("BURLINGTON", result.addressCity)
                assertEquals("S4VT00033", result.candidateId)
                assertEquals("F", result.candidateStatus)
                assertNull(result.addressZip)
                assertEquals("INDEPENDENT", result.partyFull)
                assertEquals("Incumbent", result.incumbentChallengeFull)
                assertFalse(result.candidateInactive!!)
                assertEquals("IND", result.party)
                assertEquals(listOf(1976, 2006, 2008, 2010, 2012, 2014, 2016, 2018), result.cycles)
                assertEquals("I", result.incumbentChallenge)
                assertEquals("Senate", result.officeFull)
                assertNull(result.addressStreet1)
                assertEquals("S4VT00033", result.flags)
                assertEquals(0, result.districtNumber)
                assertNull(result.addressStreet2)
                assertEquals("SANDERS, BERNARD", result.name)
                assertEquals("2016-11-17T06:10:49", result.loadDate)
                assertEquals("VT", result.state)
                assertEquals("00", result.district)
                assertEquals("VT", result.addressState)
                assertEquals(2016, result.twoYearPeriod)
            }
        }
    }
}