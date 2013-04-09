/**
 * Copyright (C) 2013 Tokanagrammar Team
 *
 * This is a jigsaw-like puzzle game,
 * except each piece is token from a source file,
 * and the 'complete picture' is the program.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.umb.cs.source.std;

import edu.umb.cs.source.SourceToken;

/**
 *
 * @author Vy Thao Nguyen
 */
public class IdentifierToken implements SourceToken
{
    private final String image;
    
    public IdentifierToken (String img)
    {
        image = img;
    }

    @Override
    public String image()
    {
        return image;
    }

    @Override
    public boolean isKeyWord()
    {
        return false;
    }

    @Override
    public boolean isLiteral()
    {
        return false;
    }

    @Override
    public boolean isIdentifier()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isQuotedString()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isTab()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSpace()
    {
        return false;
    }
    
    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}