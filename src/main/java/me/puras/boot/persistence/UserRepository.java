package me.puras.boot.persistence;

import me.puras.boot.domain.User;
import net.mooko.common.persistence.CrudRepository;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by puras on 16/5/3.
 */
@Mapper
public interface UserRepository extends CrudRepository<User> {
}
