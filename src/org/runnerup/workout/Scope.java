/*
 * Copyright (C) 2012 - 2013 jonas.oreland@gmail.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.runnerup.workout;

import org.runnerup.R;

/**
 * This is just constant
 */
public enum Scope {

	WORKOUT(1, R.string.workout),
	STEP(2, R.string.activity),
	LAP(3, R.string.lap),
	CURRENT(4, R.string.current);

	int value = 0;
	int cueId = 0;

	private Scope(int val, int cueId) {
		this.value = val;
		this.cueId = cueId;
	}

	/**
	 * @return the scopeValue
	 */
	public int getValue() {
		return value;
	}

	public boolean equal(Scope what) {
		if (what == null || what.value != this.value)
			return false;
		return true;
	}

	public int getCueId() {
		return cueId;
	}
}
