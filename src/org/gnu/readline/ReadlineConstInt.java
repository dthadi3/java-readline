/**************************************************************************
/* ReadlineConstInt.java -- The class for constants for integer Readline
/*                          variables
/*
/* Java Wrapper Copyright (c) 1998-2003 by Bernhard Bablok (mail@bablokb.de)
/*
/* This program is free software; you can redistribute it and/or modify
/* it under the terms of the GNU Library General Public License as published
/* by  the Free Software Foundation; either version 2 of the License or
/* (at your option) any later version.
/*
/* This program is distributed in the hope that it will be useful, but
/* WITHOUT ANY WARRANTY; without even the implied warranty of
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/* GNU Library General Public License for more details.
/*
/* You should have received a copy of the GNU Library General Public License
/* along with this program; see the file COPYING.LIB.  If not, write to
/* the Free Software Foundation Inc., 51 Franklin Street, Fifth Floor,
/* Boston, MA  02110-1301 USA
/**************************************************************************/

package org.gnu.readline;

/**
   This class implements constants for integer Readline variables.
   The constants are used to access internal variables of the
   underlying implementation.

   <p> Note that the class does not add additional functionality, it
   is used only for method-overloading.

 @version $Revision$
 @author  $Author$
*/

class ReadlineConstInt  extends ReadlineConstBase {
  
  /**
     Constructor. The constructor is protected, since the class should not
     be used outside of the package.
  */

  protected ReadlineConstInt(int number, ReadlineLibrary[] support) {
    super(number,support);
  }
}

