/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef Kaa_KaaDataMultiplexer_h
#define Kaa_KaaDataMultiplexer_h

/**
 * Multiplexer collects the info about states from different
 * services and compiles it in one request.
 *
 * Required in user implementation of any kind of data channel.
 */
@protocol KaaDataMultiplexer

/**
 * Compiles request for given transport types.
 *
 * @param types map of types to be polled <TransportType, ChannelDirection> as key-value.
 * @return compilated request
 */
- (NSData *)compileRequestForTypes:(NSDictionary *)types;

@end

#endif
