package io.github.pace543.feckotlin.test

import io.github.pace543.feckotlin.model.CommunicationCost
import io.github.pace543.feckotlin.model.CommunicationCostByCandidate
import io.github.pace543.feckotlin.model.OffsetInfo
import io.github.pace543.feckotlin.model.SeekInfo
import org.junit.Assert.*
import org.junit.Test

class CommunicationCostsTest {
    @Test
    fun testGetCommunicationCostsByCandidateFromCommittee() {
        mockClient.getCommunicationCostsByCandidateFromCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, perPage = 20, pages = 0, count = 0), data.pagination)
                assertEquals(listOf<CommunicationCostByCandidate>(), data.results)
            }
        }
    }

    @Test
    fun testGetCommunicationCosts() {
        mockClient.getCommunicationCosts().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(SeekInfo(pages = 3948, count = 78953, perPage = 20, lastIndexes = null), data.pagination)
                val result = data.results?.get(0) as CommunicationCost
                assertEquals("F7", result.formTypeCode)
                assertEquals("C70003009", result.committeeId)
                assertNull(result.stateFull)
                assertNull(result.candidateFirstName)
                assertEquals("H2AL02067", result.candidateId)
                assertEquals("http://docquery.fec.gov/pdf/588/25038722588/25038722588.pdf", result.pdfUrl)
                assertEquals("24F", result.transactionType)
                assertNull(result.communicationTypeFull)
                assertNull(result.candidateName)
                assertNull(result.supportOpposeIndicator)
                assertNull(result.candidateOfficeDistrict)
                assertEquals("BUSINESS COUNCIL OF ALABAMA", result.committeeName)
                assertNull(result.candidateOfficeFull)
                assertNull(result.purpose)
                assertEquals(2004, result.reportYear)
                assertNull(result.originalSubId)
                assertEquals("YE", result.reportType)
                assertEquals("2004-10-29T00:00:00", result.transactionDate)
                assertNull(result.candidateOfficeState)
                assertEquals("G", result.primaryGeneralIndicator)
                assertEquals("FOR EACH COMMUNICATION", result.scheduleTypeFull)
                assertNull(result.candidateMiddleName)
                assertNull(result.tranId)
                assertEquals(2021720051054604000, result.subId)
                assertNull(result.candidateLastName)
                assertEquals("F76", result.scheduleType)
                assertNull(result.communicationClass)
                assertEquals("25038722588", result.imageNumber)
                assertNull(result.candidateOffice)
                assertEquals(2004, result.cycle)
                assertEquals("NO CHANGE", result.actionCodeFull)
                assertEquals("GENERAL", result.primaryGeneralIndicatorDescription)
                assertNull(result.communicationType)
                assertNull(result.fileNumber)
                assertEquals("N", result.actionCode)
                assertEquals(13.0, result.transactionAmount)
            }
        }
    }

    @Test
    fun testGetCommunicationCostsByCandidate() {
        mockClient.getCommunicationCostsByCandidate().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 1459, count = 29169, page = 1, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CommunicationCostByCandidate
                assertEquals("MICHAUD, MICHAEL H", result.candidateName)
                assertEquals("C00000372", result.committeeId)
                assertEquals(2002, result.cycle)
                assertEquals("MAINTENANCE OF WAY POLITICAL LEAGUE", result.committeeName)
                assertEquals("H2ME02097", result.candidateId)
                assertEquals(1, result.count)
                assertEquals(1000.0, result.total)
                assertEquals("O", result.supportOpposeIndicator)
            }
        }
    }
}