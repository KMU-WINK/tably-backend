package com.github.kmu_wink.domain.user.schema;

import com.github.kmu_wink.common.database.BaseSchema;
import com.github.kmu_wink.domain.user.constant.Club;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseSchema {

    String socialId;

    Club club;

    String name;

    String email;
}

