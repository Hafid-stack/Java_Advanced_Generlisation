package Generic;

import java.util.List;

public interface Metier<T> {
    void add(T o);
    List<T> getAll();
    T findById(long id);
    void delete(long id);
}
