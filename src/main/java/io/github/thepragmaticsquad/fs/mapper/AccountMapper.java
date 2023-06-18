package io.github.thepragmaticsquad.fs.mapper;


import io.github.thepragmaticsquad.fs.entity.Account;
import io.github.thepragmaticsquad.fs.model.AccountDetailedModel;
import io.github.thepragmaticsquad.fs.model.AccountModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
    AccountModel toModel(Account entity);
    AccountDetailedModel toDetailedAccountModel(Account entity);
    Account toEntity(AccountModel model);

}
