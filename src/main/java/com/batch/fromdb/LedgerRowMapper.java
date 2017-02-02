package com.batch.fromdb;

import com.batch.todb.Ledger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("ledgerRowMapper")
public class LedgerRowMapper implements RowMapper<Ledger>
{

    public Ledger mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Ledger ledger = new Ledger();
        ledger.setId(rs.getInt("id"));
        ledger.setReceiptDate(rs.getDate("rcv_dt"));
        ledger.setMemberName(rs.getString("mbr_nm"));
        ledger.setCheckNumber(rs.getString("chk_nbr"));
        ledger.setCheckDate(rs.getDate("chk_dt"));
        ledger.setPaymentType(rs.getString("pymt_typ"));
        ledger.setDepositAmount(rs.getDouble("dpst_amt"));
        ledger.setPaymentAmount(rs.getDouble("pymt_amt"));
        ledger.setComments(rs.getString("comments"));
        return ledger;
    }
}
