package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private MyPageDTO myPageDTO = new MyPageDTO();

	public MyPageDTO getMyPageUserInfo(String item_transaction_id, String user_master_id)throws SQLException{
		String sql = "SELECT iit.item_name, ubit.total_price, ubit.total_count,"
				+ "ubit.pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction ubit ON"
				+ " ubit.item_transaction_id = iit.id WHERE ubit.item_transaction_id = ? AND"
				+ " ubit.user_master_id = ? ORDER BY ubit.insert_date DESC";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				myPageDTO.setItemName(resultSet.getString("item_name"));
				myPageDTO.setTotalPrice(resultSet.getString("totalprice"));
				myPageDTO.setTotalCount(resultSet.getString("totalcount"));
				myPageDTO.setPayment(resultSet.getString("pay"));
			}

			}catch (Exception e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return myPageDTO;
		}

		public int buyItemHistoryDelete(String item_transaction_id, String user_master_id)
		throws SQLException{
			String sql = "DELETE FROM user_buy_item_transaction WHERE item_transaction_id = ? AND user_master_id = ?";
			PreparedStatement preparedStatement;
			int result = 0;

			try{
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, item_transaction_id);
				preparedStatement.setString(2, user_master_id);

				result = preparedStatement.executeUpdate();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return result;
		}
}
