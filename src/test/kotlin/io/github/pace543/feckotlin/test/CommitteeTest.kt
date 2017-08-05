package io.github.pace543.feckotlin.test

import org.junit.Assert.assertNotNull
import org.junit.Test

class CommitteeTest {
    @Test
    fun testGetCommitteesFromCandidate() {
        mockClient.getCommitteesFromCandidate("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCommitteesHistoryFromCandidate() {
        mockClient.getCommitteesHistoryFromCandidate("P60007168").subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCommitteesHistoryByCycleFromCandidate() {
        mockClient.getCommitteesHistoryByCycleFromCandidate("P60007168", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCommittee() {
        mockClient.getCommittee("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCommitteeHistory() {
        mockClient.getCommitteeHistory("C00411330").subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCommitteeHistoryByCycle() {
        mockClient.getCommitteeHistoryByCycle("C00411330", 2016).subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }

    @Test
    fun testGetCommittees() {
        mockClient.getCommittees().subscribe {
            res ->
            assertNotNull(res)
            res.apply {

            }
        }
    }
}