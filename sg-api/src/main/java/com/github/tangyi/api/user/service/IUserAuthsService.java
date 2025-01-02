/*
 * Copyright 2024 The sg-exam authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.tangyi.api.user.service;

import com.github.tangyi.api.user.model.User;
import com.github.tangyi.api.user.model.UserAuths;
import com.github.tangyi.common.service.ICrudService;

import java.util.List;

public interface IUserAuthsService extends ICrudService<UserAuths> {

	UserAuths getByIdentifier(UserAuths userAuths);

	UserAuths getByUserId(UserAuths userAuths);

	List<UserAuths> getListByUsers(List<User> userList);

	int deleteByIdentifier(UserAuths userAuths);

	int deleteByUserId(UserAuths userAuths);

	int insertBatch(List<UserAuths> userAuths);
}