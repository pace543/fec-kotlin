package io.github.pace543.feckotlin.test

import io.github.pace543.feckotlin.model.Committee
import io.github.pace543.feckotlin.model.CommitteeDetail
import io.github.pace543.feckotlin.model.CommitteeHistory
import io.github.pace543.feckotlin.model.OffsetInfo
import org.junit.Assert.*
import org.junit.Test

class CommitteeTest {
    @Test
    fun testGetCommitteesFromCandidate() {
        mockClient.getCommitteesFromCandidate("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, perPage = 20, pages = 1, count = 12), data.pagination)
                val result = data.results?.get(0) as CommitteeDetail
                assertEquals("SUSAN", result.treasurerName1)
                assertNull(result.partyType)
                assertEquals("F1", result.formType)
                assertEquals("BURLINGTON", result.custodianCity)
                assertEquals("DEMOCRATIC PARTY", result.partyFull)
                assertEquals("PO BOX 905", result.street1)
                assertNull(result.street2)
                assertNull(result.organizationType)
                assertNull(result.leadershipPac)
                assertEquals(listOf(2016, 2018), result.cycles)
                assertNull(result.custodianStreet2)
                assertEquals("BURLINGTON", result.treasurerCity)
                assertEquals("COMPLIANCE@BERNIESANDERS.COM", result.email)
                assertNull(result.qualifyingDate)
                assertNull(result.organizationTypeFull)
                assertEquals("BERNIESANDERS.COM", result.website)
                assertEquals("SUSAN", result.custodianName1)
                assertEquals("Q", result.filingFrequency)
                assertEquals("TREASURER", result.treasurerNameTitle)
                assertNull(result.partyTypeFull)
                assertNull(result.treasurerStreet2)
                assertEquals("C00577130", result.committeeId)
                assertEquals("JACKSON", result.treasurerName2)
                assertEquals("05402", result.treasurerZip)
                assertEquals("Presidential", result.committeeTypeFull)
                assertNull(result.fax)
                assertEquals("JACKSON, SUSAN", result.treasurerName)
                assertEquals("VT", result.treasurerState)
                assertNull(result.treasurerNameSuffix)
                assertNull(result.lobbyistRegistrantPac)
                assertEquals("DEM", result.party)
                assertEquals("05402", result.zip)
                assertEquals("P", result.designation)
                assertEquals("VT", result.state)
                assertNull(result.treasurerNamePrefix)
                assertEquals("Vermont", result.stateFull)
                assertNull(result.custodianNamePrefix)
                assertEquals(listOf("P60007168"), result.candidateIds)
                assertNull(result.custodianNameMiddle)
                assertNull(result.custodianNameSuffix)
                assertEquals("TREASURER", result.custodianNameTitle)
                assertNull(result.treasurerNameMiddle)
                assertEquals("8554237643", result.treasurerPhone)
                assertEquals("8554237643", result.custodianPhone)
                assertEquals("P", result.committeeType)
                assertEquals("BERNIE 2016", result.name)
                assertEquals("P.O. BOX 905", result.custodianStreet1)
                assertEquals("Principal campaign committee", result.designationFull)
                assertEquals("JACKSON, SUSAN", result.custodianNameFull)
                assertEquals("JACKSON", result.custodianName2)
                assertEquals("05402", result.custodianZip)
            }
        }
    }

    @Test
    fun testGetCommitteesHistoryFromCandidate() {
        mockClient.getCommitteesHistoryFromCandidate("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1, count = 17, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CommitteeHistory
                assertEquals("03766", result.zip)
                assertEquals("STEPHEN T LEBLANC", result.treasurerName)
                assertEquals("LEBANON", result.city)
                assertEquals("New Hampshire", result.stateFull)
                assertEquals(listOf("P60007168"), result.candidateIds)
                assertNull(result.organizationType)
                assertEquals("9 AMSDEN STREET", result.street1)
                assertEquals("U", result.designation)
                assertNull(result.street2)
                assertEquals("UPPER VALLEY FOR BERNIE SANDERS", result.name)
                assertEquals("Single Candidate Independent Expenditure", result.committeeTypeFull)
                assertEquals("C00590828", result.committeeId)
                assertNull(result.partyFull)
                assertEquals("U", result.committeeType)
                assertEquals(listOf(2016, 2018), result.cycles)
                assertNull(result.party)
                assertEquals(2018, result.cycle)
                assertEquals("NH", result.state)
                assertNull(result.organizationTypeFull)
                assertEquals("Unauthorized", result.designationFull)
            }
        }
    }

    @Test
    fun testGetCommitteesHistoryByCycleFromCandidate() {
        mockClient.getCommitteesHistoryByCycleFromCandidate("P60007168", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1, perPage = 20, count = 12), data.pagination)
                val result = data.results?.get(0) as CommitteeHistory
                assertNull(result.party)
                assertEquals(listOf(2016), result.cycles)
                assertEquals("35 WEST ROAD", result.street1)
                assertEquals("NH", result.state)
                assertNull(result.partyFull)
                assertEquals("C00590240", result.committeeId)
                assertEquals("CLARKSVILLE", result.city)
                assertEquals(2016, result.cycle)
                assertNull(result.organizationType)
                assertEquals(listOf("P60007168"), result.candidateIds)
                assertNull(result.street2)
                assertEquals("03592", result.zip)
                assertNull(result.organizationTypeFull)
                assertEquals("NORTHEAST MUSICIANS FOR SOCIAL DEMOCRACY", result.name)
                assertEquals("U", result.designation)
                assertEquals("Unauthorized", result.designationFull)
                assertEquals("New Hampshire", result.stateFull)
                assertEquals("N", result.committeeType)
                assertEquals("PAC - Nonqualified", result.committeeTypeFull)
                assertEquals("JANE BRICKETT", result.treasurerName)
            }
        }
    }

    @Test
    fun testGetCommittee() {
        mockClient.getCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, pages = 1, perPage = 20, count = 1), data.pagination)
                val result = data.results?.get(0) as CommitteeDetail
                assertNull(result.partyTypeFull)
                assertNull(result.qualifyingDate)
                assertEquals("BURLINGTON", result.city)
                assertEquals("PO BOX 391", result.street1)
                assertNull(result.custodianCity)
                assertNull(result.treasurerStreet1)
                assertEquals("INDEPENDENT", result.partyFull)
                assertNull(result.treasurerNameTitle)
                assertNull(result.fax)
                assertNull(result.custodianName1)
                assertNull(result.treasurerZip)
                assertEquals("VT", result.state)
                assertEquals("S", result.committeeType)
                assertNull(result.custodianNameMiddle)
                assertNull(result.custodianStreet2)
                assertNull(result.treasurerName1)
                assertNull(result.treasurerName2)
                assertNull(result.custodianState)
                assertEquals("BERNIE.SANDERS@GMAIL.COM", result.email)
                assertNull(result.custodianNamePrefix)
                assertNull(result.treasurerNamePrefix)
                assertEquals(listOf("S4VT00033"), result.candidateIds)
                assertEquals("C00411330", result.committeeId)
                assertNull(result.treasurerNameMiddle)
                assertEquals(listOf(2018, 2008, 2010, 2006, 2016, 2014, 2012), result.cycles)
                assertEquals("Senate", result.committeeTypeFull)
                assertEquals("05402", result.zip)
                assertNull(result.partyType)
                assertEquals("Vermont", result.stateFull)
                assertNull(result.custodianNameTitle)
                assertNull(result.custodianStreet1)
                assertNull(result.organizationType)
                assertNull(result.treasurerPhone)
                assertEquals("F1", result.formType)
                assertEquals("Principal campaign committee", result.designationFull)
                assertEquals("IND", result.party)
                assertNull(result.custodianPhone)
                assertNull(result.street2)
                assertNull(result.lobbyistRegistrantPac)
                assertNull(result.custodianNameSuffix)
                assertNull(result.leadershipPac)
                assertNull(result.custodianZip)
                assertEquals("WWW.BERNIE.ORG", result.website)
                assertEquals("LORA HAGGARD", result.treasurerName)
                assertEquals("P", result.designation)
                assertNull(result.treasurerNameSuffix)
                assertEquals("Q", result.filingFrequency)
                assertEquals("FRIENDS OF BERNIE SANDERS", result.name)
                assertNull(result.custodianNameFull)
                assertNull(result.treasurerState)
                assertNull(result.organizationTypeFull)
                assertNull(result.treasurerCity)
                assertNull(result.treasurerStreet2)
                assertNull(result.custodianName2)
            }
        }
    }

    @Test
    fun testGetCommitteeHistory() {
        mockClient.getCommitteeHistory("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, perPage = 20, pages = 1, count = 7), data.pagination)
                val result = data.results?.get(0) as CommitteeHistory
                assertEquals("IND", result.party)
                assertEquals(listOf(2018, 2008, 2010, 2006, 2016, 2014, 2012), result.cycles)
                assertEquals("PO BOX 391", result.street1)
                assertEquals("VT", result.state)
                assertEquals("INDEPENDENT", result.partyFull)
                assertEquals("C00411330", result.committeeId)
                assertEquals("BURLINGTON", result.city)
                assertEquals(2018, result.cycle)
                assertNull(result.organizationType)
                assertEquals(listOf("S4VT00033"), result.candidateIds)
                assertNull(result.street2)
                assertEquals("05402", result.zip)
                assertNull(result.organizationTypeFull)
                assertEquals("FRIENDS OF BERNIE SANDERS", result.name)
                assertEquals("P", result.designation)
                assertEquals("Principal campaign committee", result.designationFull)
                assertEquals("Vermont", result.stateFull)
                assertEquals("S", result.committeeType)
                assertEquals("Senate", result.committeeTypeFull)
                assertEquals("LORA HAGGARD", result.treasurerName)
            }
        }
    }

    @Test
    fun testGetCommitteeHistoryByCycle() {
        mockClient.getCommitteeHistoryByCycle("C00411330", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 1, page = 1, count = 1, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CommitteeHistory
                assertEquals("05402", result.zip)
                assertEquals("LORA HAGGARD", result.treasurerName)
                assertEquals("BURLINGTON", result.city)
                assertEquals("Vermont", result.stateFull)
                assertEquals(listOf("S4VT00033"), result.candidateIds)
                assertNull(result.organizationType)
                assertEquals("PO BOX 391", result.street1)
                assertEquals("P", result.designation)
                assertNull(result.street2)
                assertEquals("FRIENDS OF BERNIE SANDERS", result.name)
                assertEquals("Senate", result.committeeTypeFull)
                assertEquals("C00411330", result.committeeId)
                assertEquals("INDEPENDENT", result.partyFull)
                assertEquals("S", result.committeeType)
                assertEquals(listOf(2018, 2008, 2010, 2006, 2016, 2014, 2012), result.cycles)
                assertEquals("IND", result.party)
                assertEquals(2016, result.cycle)
                assertEquals("VT", result.state)
                assertNull(result.organizationTypeFull)
                assertEquals("Principal campaign committee", result.designationFull)
            }
        }
    }

    @Test
    fun testGetCommittees() {
        mockClient.getCommittees().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 2978, page = 1, count = 59550, perPage = 20), data.pagination)
                val result = data.results?.get(0) as Committee
                assertEquals("P", result.committeeType)
                assertEquals(listOf("P20001954"), result.candidateIds)
                assertNull(result.organizationType)
                assertEquals("EDEAN BUNDICK", result.treasurerName)
                assertEquals("P", result.designation)
                assertEquals("Presidential", result.committeeTypeFull)
                assertEquals("007 GO GODWIN COMMITTEE", result.name)
                assertEquals("C00462390", result.committeeId)
                assertEquals("DEMOCRATIC PARTY", result.partyFull)
                assertEquals(listOf(2016, 2014, 2012, 2010), result.cycles)
                assertEquals("DEM", result.party)
                assertEquals("VA", result.state)
                assertNull(result.organizationTypeFull)
                assertEquals("Principal campaign committee", result.designationFull)
            }
        }
    }
}