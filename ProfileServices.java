
import java.sql.SQLException;
import java.util.List;


public interface ProfileServices {
    Profil insert(Profil profil) throws SQLException;
    void update(Profil profil) throws SQLException;
    void delete(int id) throws SQLException;
    List getAll() throws SQLException;
}
