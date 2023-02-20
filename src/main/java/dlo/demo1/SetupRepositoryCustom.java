package dlo.demo1;

import dlo.demo1.data.external.domain.ExternalData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SetupRepositoryCustom {
    private final JdbcTemplate jdbcTemplate;

    public void saveBulk(List<ExternalData> data) {
        jdbcTemplate.batchUpdate("insert into comment(article_id, comment) " +
                "values(?, ?)",
            new BatchPreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
//                    ps.setLong(1, articleId);
//                    ps.setString(2, comments.get(i).getComment());
                }

                @Override
                public int getBatchSize() {
//                    return comments.size();
                    return data.size();
                }
            });
    }
}
