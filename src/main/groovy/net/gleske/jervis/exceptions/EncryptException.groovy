/*
   Copyright 2014-2016 Sam Gleske - https://github.com/samrocketman/jervis

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   */
package net.gleske.jervis.exceptions

/**
  A type of <tt>{@link net.gleske.jervis.exceptions.SecurityException}</tt> which is thrown when an encryption issue occurs.

  <h2>Sample usage</h2>
<pre><tt>import net.gleske.jervis.exceptions.EncryptException
throw new EncryptException('some reason')</tt></pre><br>
 */
class EncryptException extends SecurityException {

    /**
      Throw an exception relaying why encrypting a string failed.

      @param message A simple message.
     */
    def EncryptException(String message) {
        super(message)
    }
}
