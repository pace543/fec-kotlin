package io.github.pace543.feckotlin.test

import io.github.pace543.feckotlin.model.CandidateDetail
import io.github.pace543.feckotlin.model.CandidateHistory
import io.github.pace543.feckotlin.model.OffsetInfo
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

            }
        }
    }

    @Test
    fun testGetCandidates() {
        mockClient.getCandidates().subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCandidatesSearch() {
        mockClient.getCandidatesSearch().subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCandidatesTotals() {
        mockClient.getCandidatesTotals().subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCandidatesFromCommittee() {
        mockClient.getCandidatesFromCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCandidatesHistoryFromCommittee() {
        mockClient.getCandidatesFromCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCandidatesHistoryByCycleFromCommittee() {
        mockClient.getCandidatesHistoryByCycleFromCommittee("C00411330", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }
}