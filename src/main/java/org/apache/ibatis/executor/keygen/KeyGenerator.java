/**
 * Copyright 2009-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ibatis.executor.keygen;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;

import java.sql.Statement;

/**
 * 获取插入过程中生成的自增主键
 *
 * @author Clinton Begin
 */
public interface KeyGenerator {

    /**
     * 在 insert 之前执行， order=BEFORE
     *
     * @param executor
     * @param ms
     * @param stmt
     * @param parameter
     */
    void processBefore(Executor executor, MappedStatement ms, Statement stmt, Object parameter);

    /**
     * 在 insert 之后执行， order=AFTER
     *
     * @param executor
     * @param ms
     * @param stmt
     * @param parameter
     */
    void processAfter(Executor executor, MappedStatement ms, Statement stmt, Object parameter);

}
