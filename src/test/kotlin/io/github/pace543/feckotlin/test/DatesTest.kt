package io.github.pace543.feckotlin.test

import io.github.pace543.feckotlin.model.CalendarDate
import io.github.pace543.feckotlin.model.ElectionDate
import io.github.pace543.feckotlin.model.OffsetInfo
import io.github.pace543.feckotlin.model.ReportDate
import org.junit.Assert.*
import org.junit.Test

class DatesTest {
    @Test
    fun testGetCalendarDates() {
        mockClient.getCalendarDates().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(pages = 371, count = 7417, page = 1, perPage = 20), data.pagination)
                val result = data.results?.get(0) as CalendarDate
                assertEquals("2018-01-31", result.startDate)
                assertEquals("report-YE", result.category)
                assertEquals("YEAR-END Report is Due Today", result.summary)
                assertNull(result.location)
                assertEquals(2145, result.eventId)
                assertNull(result.url)
                assertTrue(result.allDay!!)
                assertEquals(0, result.state?.size)
                assertEquals(": YEAR-END Report is Due Today", result.description)
                assertNull(result.endDate)
            }
        }
    }

    @Test
    fun testGetElectionDates() {
        mockClient.getElectionDates().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(perPage = 20, page = 1, pages = 108, count = 2160), data.pagination)
                val result = data.results?.get(0) as ElectionDate
                assertNull(result.electionParty)
                assertEquals("Special election general", result.electionTypeFull)
                assertEquals("S", result.officeSought)
                assertEquals("2017-02-23T17:39:12.598385", result.primaryGeneralDate)
                assertEquals(2017, result.electionYear)
                assertEquals("2017-02-23T12:30:53+00:00", result.createDate)
                assertEquals("2017-12-12", result.electionDate)
                assertEquals("Sen. Jeff Sessions' Seat.", result.electionNotes)
                assertEquals("2017-05-09T15:13:25+00:00", result.updateDate)
                assertEquals("SG", result.electionTypeId)
                assertEquals("AL", result.electionState)
            }
        }
    }

    @Test
    fun testGetReportingDates() {
        mockClient.getReportingDates().subscribe {
            res ->
            assertNotNull(res)
            res.apply {
                val data = res.get()
                assertEquals(OffsetInfo(page = 1, perPage = 20, pages = 532, count = 10635), data.pagination)
                val result = data.results?.get(0) as ReportDate
                assertEquals("2017-01-01T00:05:13", result.updateDate)
                assertEquals(2017, result.reportYear)
                assertEquals("YE", result.reportType)
                assertEquals("2018-01-31", result.dueDate)
                assertEquals("2017-01-01T00:05:13", result.createDate)
                assertEquals("YEAR-END", result.reportTypeFull)
            }
        }
    }
}