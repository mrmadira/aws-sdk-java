/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

/**
 * <p>
 * Amazon Lex provides both build and runtime endpoints. Each endpoint provides a set of operations (API). Your
 * application uses the runtime API to understand user utterances (user input text or voice). For example, suppose user
 * says "I want pizza", your application sends this input to Amazon Lex using the runtime API. Amazon Lex recognizes
 * that the user request is for the OrderPizza intent (one of the intents defined in the application). Then Amazon Lex
 * engages in user conversation on behalf of the application to elicit required information (slot values, such as pizza
 * size and crust type), and then performs fulfillment activity (that you configured when you created the application).
 * You use the build-time API to create and manage your Amazon Lex applications. For a list of build-time operations,
 * see the build-time API. .
 * </p>
 */
package com.amazonaws.services.lexruntime;
