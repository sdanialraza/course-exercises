/**
 * Returns whether the provided boolean is true or not.
 *
 * @param {boolean} boolean - The boolean to check.
 * @returns {boolean} Whether the provided boolean is true or not.
 *
 * @example
 * isTrue(true) // true
 * isTrue(false) // false
 *
 * @author sdanialraza
 * @version 1.0.0
 * @since 1.0.0 
 */
function isTrue(boolean) {
	return !!(boolean ? true : false)
}
