/*
 * Copyright (C) 2018 Raghavan Renganathan <renganathan.raghavan@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package utils;

/**
 * The Entity abstract class will be used to act as a base class for any 
 * Manageable entity
 * 
 * @author  Raghavan Renganathan <renganathan.raghavan@gmail.com>
 * @version 1.0
 * @since   Feb 7, 2018
 */
public abstract class Entity {
    
    public abstract boolean identifies(String key, String value);

}
