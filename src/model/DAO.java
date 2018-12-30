package model;

public interface DAO<T> {
    public Boolean insert(T entity);

    public T getById(Long id);

    public Boolean updateById(Long id);

    public Boolean deleteById(Long id);
}
