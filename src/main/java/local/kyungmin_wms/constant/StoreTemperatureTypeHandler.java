package local.kyungmin_wms.constant;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class StoreTemperatureTypeHandler implements TypeHandler<StoreTemperature> {

  @Override
  public void setParameter(PreparedStatement ps, int i, StoreTemperature parameter,
      JdbcType jdbcType) throws SQLException {

  }

  @Override
  public StoreTemperature getResult(ResultSet rs, String columnName) throws SQLException {
    return null;
  }

  @Override
  public StoreTemperature getResult(ResultSet rs, int columnIndex) throws SQLException {
    return null;
  }

  @Override
  public StoreTemperature getResult(CallableStatement cs, int columnIndex) throws SQLException {
    return null;
  }
}
