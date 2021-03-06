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
  A type of <tt>{@link net.gleske.jervis.exceptions.SecurityException}</tt> which is thrown when an issue with generating key pairs occurs.

  <h2>Sample usage</h2>
<pre><tt>import net.gleske.jervis.exceptions.KeyGenerationException
throw new KeyGenerationException('some reason')</tt></pre><br>
 */
class KeyGenerationException extends SecurityException {

    /**
      Throw an exception relaying why RSA key generation failed.

      @param message A simple message.
     */
    def KeyGenerationException(String message) {
        super(message)
    }
}
